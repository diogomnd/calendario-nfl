package br.ufpb.dcx.calendarionfl;

import java.io.*;
import java.util.*;


public class GravadorDeDados {
    private static final String ARQUIVO_TIMES = "times.dat";
    private static final String ARQUIVO_JOGOS = "jogos.dat";
    private final Calendario calendario = new Calendario();

    public void salvarTimes() throws IOException {
        ObjectOutputStream out;
        Map<String, Franquia> franquias = calendario.criarFranquias();
        calendario.definirAdversarios(franquias);
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

    public void salvarJogos() throws IOException {
        ObjectOutputStream out;
        List<Jogo> jogos = calendario.criarJogos();
        try {
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_JOGOS));
            out.writeObject(jogos);
        } catch (Exception e) {
            throw new IOException("Erro ao salvar os times no arquivo " + ARQUIVO_JOGOS);
        }
    }
}