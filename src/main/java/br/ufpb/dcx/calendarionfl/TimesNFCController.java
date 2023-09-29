package br.ufpb.dcx.calendarionfl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Map;

public class TimesNFCController {

    private static final GravadorDeDados gravador = new GravadorDeDados();

    protected static void botaoBearsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia bears = franquias.get("Bears");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Bears na temporada:\n");
            for (Jogo j : bears.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoLionsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia lions = franquias.get("Lions");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Lions na temporada:\n");
            for (Jogo j : lions.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoPackersActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia packers = franquias.get("Packers");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Packers na temporada:\n");
            for (Jogo j : packers.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoVikingsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia vikings = franquias.get("Vikings");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Vikings na temporada:\n");
            for (Jogo j : vikings.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoCowboysActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia cowboys = franquias.get("Cowboys");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Cowboys na temporada:\n");
            for (Jogo j : cowboys.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoGiantsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia giants = franquias.get("Giants");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Giants na temporada:\n");
            for (Jogo j : giants.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoEaglesActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia eagles = franquias.get("Eagles");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Eagles na temporada:\n");
            for (Jogo j : eagles.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoCommandersActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia commanders = franquias.get("Commanders");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Commanders na temporada:\n");
            for (Jogo j : commanders.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoCardinalsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia cardinals = franquias.get("Cardinals");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Cardinals na temporada:\n");
            for (Jogo j : cardinals.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoRamsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia rams = franquias.get("Rams");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Rams na temporada:\n");
            for (Jogo j : rams.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botao49ersActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia niners = franquias.get("49ers");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos 49ers na temporada:\n");
            for (Jogo j : niners.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoSeahakwsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia seahawks = franquias.get("Seahawks");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Seahakws na temporada:\n");
            for (Jogo j : seahawks.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoFalconsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia falcons = franquias.get("Falcons");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Falcons na temporada:\n");
            for (Jogo j : falcons.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoPanthersActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia panthers = franquias.get("Panthers");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Panthers na temporada:\n");
            for (Jogo j : panthers.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoSaintsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia saints = franquias.get("Saints");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Saints na temporada:\n");
            for (Jogo j : saints.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoBuccaneersActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia buccaneers = franquias.get("Buccaneers");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Buccaneers na temporada:\n");
            for (Jogo j : buccaneers.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

}