package br.ufpb.dcx.calendarionfl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Map;

public class TimesAFCController {

    private static final GravadorDeDados gravador = new GravadorDeDados();

    protected static void botaoRavensActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia ravens = franquias.get("Ravens");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Ravens na temporada:\n");
            for (Jogo j : ravens.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoBengalsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia bengals = franquias.get("Bengals");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Bengals na temporada:\n");
            for (Jogo j : bengals.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoBrownsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia browns = franquias.get("Browns");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Browns na temporada:\n");
            for (Jogo j : browns.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoSteelersActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia steelers = franquias.get("Steelers");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Steelers na temporada:\n");
            for (Jogo j : steelers.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoBillsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia bills = franquias.get("Bills");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Bills na temporada:\n");
            for (Jogo j : bills.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoDolphinsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia dolphins = franquias.get("Dolphins");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Dolphins na temporada:\n");
            for (Jogo j : dolphins.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoPatriotsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia patriots = franquias.get("Patriots");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Patriots na temporada:\n");
            for (Jogo j : patriots.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoJetsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia jets = franquias.get("Jets");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Jets na temporada:\n");
            for (Jogo j : jets.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoBroncosActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia broncos = franquias.get("Broncos");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Broncos na temporada:\n");
            for (Jogo j : broncos.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoRaidersActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia raiders = franquias.get("Raiders");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Raiders na temporada:\n");
            for (Jogo j : raiders.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoChargersActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia chargers = franquias.get("Chargers");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Chargers na temporada:\n");
            for (Jogo j : chargers.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoChiefsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia chiefs = franquias.get("Chiefs");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Chiefs na temporada:\n");
            for (Jogo j : chiefs.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoTexansActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia texans = franquias.get("Texans");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Texans na temporada:\n");
            for (Jogo j : texans.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoColtsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia colts = franquias.get("Colts");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Colts na temporada:\n");
            for (Jogo j : colts.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoJaguarsActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia jaguars = franquias.get("Jaguars");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Jaguars na temporada:\n");
            for (Jogo j : jaguars.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    protected static void botaoTitansActionPerformed(ActionEvent evt) {
        try {
            Map<String, Franquia> franquias = gravador.recuperarTimes();
            Franquia titans = franquias.get("Titans");
            StringBuilder sb = new StringBuilder();
            sb.append("Jogos dos Titans na temporada:\n");
            for (Jogo j : titans.getAdversarios())
                sb.append(j).append("\n");
            JOptionPane.showMessageDialog(null, sb);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

}