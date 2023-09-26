package br.ufpb.dcx.calendarionfl;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static br.ufpb.dcx.calendarionfl.Conferencia.parseConferencia;
import static br.ufpb.dcx.calendarionfl.Divisao.parseDivisao;

public class GravadorDeDados {
    public static final String ARQUIVO_TIMES = "times.dat";
    public static final String ARQUIVO_TIMES_TXT = "times.txt";
    public static final String ARQUIVO_JOGOS = "jogos.dat";
    public static final String ARQUIVO_JOGOS_TXT = "jogos.txt";


    /**
     * Cria os objetos que representam cada franquia da liga
     *
     * @return um mapa que contém todas as franquias da liga
     * @throws IOException caso haja um erro na leitura do arquivo
     */
    private Map<String, Franquia> criarFranquias() throws IOException {
        try {
            FileReader leitorArquivo = new FileReader(ARQUIVO_TIMES_TXT);
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
    private void definirAdversarios(Map<String, Franquia> franquias) throws IOException {
        try {
            String linha;
            for (Franquia f : franquias.values()) {
                FileReader fr = new FileReader(ARQUIVO_JOGOS_TXT);
                BufferedReader br = new BufferedReader(fr);
                List<Franquia> adversarios = f.getAdversarios();
                List<String> adversariosTmp = new LinkedList<>();
                while ((linha = br.readLine()) != null) {
                    if (linha.contains("@")) {
                        String[] tmp = linha.split("@");
                        if (tmp[0].equals(f.getNome()))
                            adversariosTmp.add(tmp[1]);
                        else if (tmp[1].equals(f.getNome()))
                            adversariosTmp.add(tmp[0]);
                    }
                }
                for (String a : adversariosTmp)
                    adversarios.add(franquias.get(a));
                f.setAdversarios(adversarios);
                fr.close();
                br.close();
            }
        } catch (IOException e) {
            throw new IOException();
        }
    }

    public void salvarTimes() throws IOException {
        ObjectOutputStream out;
        Map<String, Franquia> franquias = criarFranquias();
        definirAdversarios(franquias);
        try {
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_TIMES));
            out.writeObject(franquias);
        } catch (Exception e) {
            throw new IOException("Erro ao salvar os times no arquivo " + ARQUIVO_TIMES);
        }
    }

    @SuppressWarnings("unchecked")
    public Map<String, Franquia> recuperarTimes() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO_TIMES))) {
            return (LinkedHashMap<String, Franquia>) in.readObject();
        } catch (Exception e) {
            System.out.println("Não foi possível recuperar os times");
            throw new IOException("Não foi possível recuperar os times do arquivo " + ARQUIVO_TIMES);

        }
    }

    private List<Jogo> criarJogos() throws IOException {
        FileReader fr = new FileReader(ARQUIVO_JOGOS_TXT);
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

    public void salvarJogos() throws IOException {
        ObjectOutputStream out;
        List<Jogo> jogos = criarJogos();
        try {
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_JOGOS));
            out.writeObject(jogos);
        } catch (Exception e) {
            throw new IOException("Erro ao salvar os times no arquivo " + ARQUIVO_JOGOS);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Jogo> recuperarJogos() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO_JOGOS))) {
            return (LinkedList<Jogo>) in.readObject();
        } catch (Exception e) {
            System.out.println("Não foi possível recuperar os times");
            throw new IOException("Não foi possível recuperar os times do arquivo " + ARQUIVO_JOGOS);

        }
    }

    public static void main(String[] args) {
        GravadorDeDados gravador = new GravadorDeDados();
        try {
            gravador.salvarTimes();
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            for (Franquia f : franquias.values()) {
                System.out.println("Adversários do " + f + ":");
                System.out.print("[");
                List<Franquia> adversarios = f.getAdversarios();
                int i = 0;
                for (Franquia a : adversarios) {
                    if (i == adversarios.size() - 1)
                        System.out.print(a);
                    else
                        System.out.print(a + ", ");
                    i++;
                }
                System.out.println("]");
            }

            gravador.salvarJogos();
            List<Jogo> jogos = gravador.recuperarJogos();
            for (Jogo j : jogos)
                System.out.println(j);

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}