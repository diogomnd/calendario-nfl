package br.ufpb.dcx.calendarionfl;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

public class NFLAppSwing extends JFrame {

    public NFLAppSwing() {
        initComponents();
        setTitle("Calendario NFL 2023");
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("Unchecked")
    private void initComponents() {
        JLabel linhaCalendario = new JLabel();
        JLabel linhaConferencia = new JLabel();
        JLabel logoNFL = new JLabel();
        JButton botaoAFC = new JButton();
        JButton botaoNFC = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(Color.white);
        setResizable(false);

        linhaCalendario.setFont(new Font("NFL", Font.PLAIN, 24));
        linhaCalendario.setHorizontalAlignment(SwingConstants.CENTER);
        linhaCalendario.setText("Calendario NFL 2023");

        linhaConferencia.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        linhaConferencia.setHorizontalAlignment(SwingConstants.CENTER);
        linhaConferencia.setText("Selecione a conferência para ver os jogos");

        logoNFL.setHorizontalAlignment(SwingConstants.CENTER);
        logoNFL.setIcon(new ImageIcon("./imgs/nfl.png"));
        logoNFL.setLabelFor(logoNFL);

        botaoAFC.setBackground(new Color(213, 10, 10));
        botaoAFC.setForeground(new Color(255, 255, 255));
        botaoAFC.setIcon(new ImageIcon("./imgs/icons/afc.png"));
        botaoAFC.setText("American Football Conference");
        botaoAFC.addActionListener(this::botaoAFCActionPerformed);

        botaoNFC.setBackground(new Color(1, 51, 105));
        botaoNFC.setForeground(new Color(255, 255, 255));
        botaoNFC.setIcon(new ImageIcon("./imgs/icons/nfc.png"));
        botaoNFC.setText("National Football Conference");
        botaoNFC.addActionListener(this::botaoNFCActionPerformed);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(botaoAFC)
                                                .addGap(33, 33, 33)
                                                .addComponent(botaoNFC)
                                                .addGap(62, 62, 62))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(linhaConferencia)
                                                .addGap(171, 171, 171))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(logoNFL, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(linhaCalendario, GroupLayout.DEFAULT_SIZE,
                                                274, Short.MAX_VALUE))
                                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(linhaCalendario)
                                .addGap(18, 18, 18)
                                .addComponent(logoNFL)
                                .addGap(43, 43, 43)
                                .addComponent(linhaConferencia)
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoAFC)
                                        .addComponent(botaoNFC))
                                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }
    private void botaoAFCActionPerformed(ActionEvent evt) {
        TimesAFCAppSwing janelaSecundaria = new TimesAFCAppSwing();
        janelaSecundaria.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                janelaSecundaria.setVisible(false);
            }
        });

        janelaSecundaria.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        janelaSecundaria.setVisible(true);
    }

    private void botaoNFCActionPerformed(ActionEvent evt) {
        TimesNFCAppSwing janelaSecundaria = new TimesNFCAppSwing();
        janelaSecundaria.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                janelaSecundaria.setVisible(false);
            }
        });

        janelaSecundaria.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        janelaSecundaria.setVisible(true);
    }

    public static void main(String[] args) {
       try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            Logger.getLogger(NFLAppSwing.class.getName()).log(Level.SEVERE, null, ex);
        }

        GravadorDeDados gravador = new GravadorDeDados();
        try {
            File jogos = new File("jogos.dat");
            File times = new File("times.dat");
            if (!jogos.exists())
                gravador.salvarJogos();

            if (!times.exists())
                gravador.salvarTimes();
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        EventQueue.invokeLater(() -> new NFLAppSwing().setVisible(true));
    }

}