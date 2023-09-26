package br.ufpb.dcx.calendarionfl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

public class CalendarioNFLAppSwing {

    public static void main(String[] args) {
        //ImageIcon logoNFL = new ImageIcon("./imgs/nfl-logo-6.png");
        ImageIcon addAFC = new ImageIcon("./imgs/icons/afc.png");
        ImageIcon addNFC = new ImageIcon("./imgs/icons/nfc.png");

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calendário da NFL 2023");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 550);

            JPanel mainPanel = new JPanel(new BorderLayout());

            // Adicionar o logo da NFL no topo
            ImageIcon nflLogo = new ImageIcon("./imgs/nfl-logo-6.png"); // Substitua "nfl_logo.png" pelo caminho real da imagem
            JLabel nflLogoLabel = new JLabel(nflLogo);
            nflLogoLabel.setHorizontalAlignment(JLabel.CENTER);

            // Texto de seleção da conferência
            JLabel selectLabel = new JLabel("Selecione a conferência para ver os jogos");
            selectLabel.setHorizontalAlignment(JLabel.CENTER);

            // Botões de seleção de conferência
            JPanel buttonPanel = new JPanel(new FlowLayout());

            ImageIcon afcLogo = new ImageIcon("./imgs/icons/afc.png"); // Substitua "afc_logo.png" pelo caminho real da imagem
            JButton afcButton = new JButton("American Football Conference", afcLogo);
            afcButton.addActionListener(e -> mostrarJogosConferencia(Conferencia.AFC));

            ImageIcon nfcLogo = new ImageIcon("./imgs/icons/nfc.png"); // Substitua "nfc_logo.png" pelo caminho real da imagem
            JButton nfcButton = new JButton("National Football Conference", nfcLogo);
            nfcButton.addActionListener(e -> mostrarJogosConferencia(Conferencia.NFC));

            buttonPanel.add(afcButton);
            buttonPanel.add(nfcButton);

            mainPanel.add(nflLogoLabel, BorderLayout.NORTH);
            mainPanel.add(selectLabel, BorderLayout.CENTER);
            mainPanel.add(buttonPanel, BorderLayout.SOUTH);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }

    // Método para mostrar os jogos da conferência selecionada
    private static void mostrarJogosConferencia(Conferencia conferencia) {
        GravadorDeDados gravadorDeDados = new GravadorDeDados();
        try {
            if (conferencia.equals(Conferencia.AFC)) {
                JOptionPane.showMessageDialog(null, "Jogos da " + conferencia);
                List<Jogo> jogos = gravadorDeDados.recuperarJogos();
                for (Jogo j : jogos)
                    JOptionPane.showMessageDialog(null, j);
            }
        } catch (IOException e) {

        }
    }
}
