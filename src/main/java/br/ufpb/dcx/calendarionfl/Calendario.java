package br.ufpb.dcx.calendarionfl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static br.ufpb.dcx.calendarionfl.Conferencia.parseConferencia;
import static br.ufpb.dcx.calendarionfl.Divisao.parseDivisao;

public class Calendario {

    private static final String ARQUIVO_TIMES = "times.txt";
    private static final String ARQUIVO_JOGOS = "jogos.txt";

    /**
     * Cria os objetos que representam cada franquia da liga
     *
     * @return um mapa que contém todas as franquias da liga
     * @throws IOException caso haja um erro na leitura do arquivo
     */
    public Map<String, Franquia> criarFranquias() throws IOException {
        try {
            FileReader leitorArquivo = new FileReader(ARQUIVO_TIMES);
            BufferedReader leitorTimes = new BufferedReader(leitorArquivo);
            Map<String, Franquia> franquias = new LinkedHashMap<>();
            String linha;
            while ((linha = leitorTimes.readLine()) != null) {
                Franquia franquia = new Franquia();
                if (linha.contains("/")) {
                    String[] split = linha.split("/");
                    franquia.setCidade(split[0]);
                    franquia.setNome(split[1]);
                    franquia.setConferencia(parseConferencia(split[2]));
                    franquia.setDivisao(parseDivisao(split[3]));
                    franquias.put(franquia.getNome(), franquia);
                }
            }
            leitorArquivo.close();
            leitorTimes.close();
            return franquias;
        } catch (IOException e) {
            throw new IOException();
        }
    }

    /**
     * Define os adversários de cada franquia ao longo do ano
     *
     * @param franquias um mapa que contém todas as franquias da liga
     * @throws IOException caso haja um erro na leitura do arquivo
     */
    public void definirAdversarios(Map<String, Franquia> franquias) throws IOException {
        try {
            String linha;
            for (Franquia f : franquias.values()) {
                FileReader fr = new FileReader(ARQUIVO_JOGOS);
                BufferedReader br = new BufferedReader(fr);
                List<Jogo> jogos = new LinkedList<>();
                while ((linha = br.readLine()) != null) {
                    if (linha.contains("@")) {
                        String[] tmp = linha.split("@");
                        if (tmp[0].equals(f.getNome()) || tmp[1].equals(f.getNome())) {
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
                            LocalDateTime date = LocalDateTime.parse(tmp[3], formatter);
                            Jogo jogo = new Jogo(tmp[0], tmp[1], tmp[2], date);
                            jogos.add(jogo);
                        }
                    }
                }
                f.setAdversarios(jogos);
            }
        } catch (IOException e) {
            throw new IOException();
        }
    }

    /**
     * Cria os objetos que representam todos os jogos
     *
     * @return uma lista encadeada que contem todos os jogos
     * @throws IOException caso haja um erro na leitura do arquivo
     */
    public List<Jogo> criarJogos() throws IOException {
        FileReader fr = new FileReader(ARQUIVO_JOGOS);
        BufferedReader br = new BufferedReader(fr);
        String linha;
        List<Jogo> jogos = new LinkedList<>();
        while ((linha = br.readLine()) != null) {
            if (linha.contains("@")) {
                String[] split = linha.split("@");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
                LocalDateTime date = LocalDateTime.parse(split[3], formatter);
                Jogo jogo = new Jogo(split[0], split[1], split[2], date);
                jogos.add(jogo);
            }
        }
        return jogos;
    }
}