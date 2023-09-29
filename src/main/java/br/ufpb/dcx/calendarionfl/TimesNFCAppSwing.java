package br.ufpb.dcx.calendarionfl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimesNFCAppSwing extends JFrame {

    public TimesNFCAppSwing() {
        setTitle("National Football Conference");
        setResizable(false);
        initComponents();
    }

    @SuppressWarnings("Unchecked")
    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JPanel jPanel5 = new JPanel();
        JLabel labelNFC = new JLabel();
        JLabel labelNorte = new JLabel();
        JLabel labelLeste = new JLabel();
        JLabel labelOeste = new JLabel();
        JLabel labelSul = new JLabel();
        JButton botaoBears = new JButton();
        JButton botaoLions = new JButton();
        JButton botaoPackers = new JButton();
        JButton botaoVikings = new JButton();
        JButton botaoCowboys = new JButton();
        JButton botaoGiants = new JButton();
        JButton botaoEagles = new JButton();
        JButton botaoCommanders = new JButton();
        JButton botaoCardinals = new JButton();
        JButton botaoRams = new JButton();
        JButton botao49ers = new JButton();
        JButton botaoSeahawks = new JButton();
        JButton botaoFalcons = new JButton();
        JButton botaoPanthers = new JButton();
        JButton botaoSaints = new JButton();
        JButton botaoBuccaneers = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));

        labelNorte.setFont(new Font("NFL", Font.PLAIN, 18));
        labelNorte.setHorizontalAlignment(SwingConstants.CENTER);
        labelNorte.setText("NORTE");

        labelLeste.setFont(new Font("NFL", Font.PLAIN, 18));
        labelLeste.setHorizontalAlignment(SwingConstants.CENTER);
        labelLeste.setText("LESTE");

        labelOeste.setFont(new Font("NFL", Font.PLAIN, 18));
        labelOeste.setHorizontalAlignment(SwingConstants.CENTER);
        labelOeste.setText("OESTE");

        labelSul.setFont(new Font("NFL", Font.PLAIN, 18));
        labelSul.setHorizontalAlignment(SwingConstants.CENTER);
        labelSul.setText("SUL");

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        botaoLions.setBackground(new Color(0, 118, 182));
        botaoLions.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoLions.setForeground(new Color(176, 183, 188));
        botaoLions.setIcon(new ImageIcon("./imgs/times/nfc/norte/lions.png"));
        botaoLions.setText("Detroit Lions");
        botaoLions.setHorizontalAlignment(SwingConstants.LEFT);
        botaoLions.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoLions.addActionListener(TimesNFCController::botaoLionsActionPerformed);

        botaoVikings.setBackground(new Color(79, 38, 131));
        botaoVikings.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoVikings.setForeground(new Color(255, 198, 47));
        botaoVikings.setIcon(new ImageIcon("./imgs/times/nfc/norte/vikings.png"));
        botaoVikings.setText("Minnesota Vikings");
        botaoVikings.setHorizontalAlignment(SwingConstants.LEFT);
        botaoVikings.addActionListener(TimesNFCController::botaoVikingsActionPerformed);

        botaoPackers.setBackground(new Color(32, 55, 49));
        botaoPackers.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoPackers.setForeground(new Color(255, 184, 28));
        botaoPackers.setIcon(new ImageIcon("./imgs/times/nfc/norte/packers.png"));
        botaoPackers.setText("Green Bay Packers");
        botaoPackers.setHorizontalAlignment(SwingConstants.LEFT);
        botaoPackers.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoPackers.addActionListener(TimesNFCController::botaoPackersActionPerformed);

        botaoBears.setBackground(new Color(11, 22, 42));
        botaoBears.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoBears.setForeground(new Color(200, 56, 3));
        botaoBears.setIcon(new ImageIcon("./imgs/times/nfc/norte/bears.png"));
        botaoBears.setText("Chicago Bears");
        botaoBears.setHideActionText(true);
        botaoBears.setHorizontalAlignment(SwingConstants.LEFT);
        botaoBears.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoBears.addActionListener(TimesNFCController::botaoBearsActionPerformed);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoLions, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoBears, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoPackers, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoVikings, GroupLayout.DEFAULT_SIZE,
                                                226, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoBears)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoLions)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPackers)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoVikings)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelNFC.setIcon(new ImageIcon("./imgs/icons/nfc.png"));

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        botaoGiants.setBackground(new Color(1, 35, 82));
        botaoGiants.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoGiants.setForeground(new Color(163, 13, 45));
        botaoGiants.setIcon(new ImageIcon("./imgs/times/nfc/leste/giants.png"));
        botaoGiants.setText("New York Giants");
        botaoGiants.setHorizontalAlignment(SwingConstants.LEFT);
        botaoGiants.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoGiants.addActionListener(TimesNFCController::botaoGiantsActionPerformed);

        botaoCommanders.setBackground(new Color(90, 20, 20));
        botaoCommanders.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoCommanders.setForeground(new Color(255, 182, 18));
        botaoCommanders.setIcon(new ImageIcon("./imgs/times/nfc/leste/commanders.png"));
        botaoCommanders.setText("Washington Commanders");
        botaoCommanders.setHorizontalAlignment(SwingConstants.LEFT);
        botaoCommanders.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoCommanders.addActionListener(TimesNFCController::botaoCommandersActionPerformed);

        botaoEagles.setBackground(new Color(0, 76, 84));
        botaoEagles.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoEagles.setForeground(new Color(165, 172, 175));
        botaoEagles.setIcon(new ImageIcon("./imgs/times/nfc/leste/eagles.png"));
        botaoEagles.setText("Philadelphia Eagles");
        botaoEagles.setHorizontalAlignment(SwingConstants.LEFT);
        botaoEagles.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoEagles.addActionListener(TimesNFCController::botaoEaglesActionPerformed);

        botaoCowboys.setBackground(new Color(4, 30, 66));
        botaoCowboys.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoCowboys.setForeground(new Color(137, 147, 151));
        botaoCowboys.setIcon(new ImageIcon("./imgs/times/nfc/leste/cowboys.png"));
        botaoCowboys.setText("Dallas Cowboys");
        botaoCowboys.setHorizontalAlignment(SwingConstants.LEFT);
        botaoCowboys.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoCowboys.addActionListener(TimesNFCController::botaoCowboysActionPerformed);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoGiants, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoCowboys, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoEagles, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoCommanders, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoCowboys)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoGiants)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoEagles)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoCommanders)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        botaoRams.setBackground(new Color(0, 53, 148));
        botaoRams.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoRams.setForeground(new Color(255, 163, 0));
        botaoRams.setIcon(new ImageIcon("./imgs/times/nfc/oeste/rams.png"));
        botaoRams.setText("Los Angeles Rams");
        botaoRams.setHorizontalAlignment(SwingConstants.LEFT);
        botaoRams.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoRams.addActionListener(TimesNFCController::botaoRamsActionPerformed);

        botaoSeahawks.setBackground(new Color(0, 34, 68));
        botaoSeahawks.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoSeahawks.setForeground(new Color(105, 190, 40));
        botaoSeahawks.setIcon(new ImageIcon("./imgs/times/nfc/oeste/seahawks.png"));
        botaoSeahawks.setText("Seattle Seahawks");
        botaoSeahawks.setHorizontalAlignment(SwingConstants.LEFT);
        botaoSeahawks.addActionListener(TimesNFCController::botaoSeahakwsActionPerformed);

        botao49ers.setBackground(new Color(170, 0, 0));
        botao49ers.setFont(new Font("NFL", Font.PLAIN, 12));
        botao49ers.setForeground(new Color(173, 153, 93));
        botao49ers.setIcon(new ImageIcon("./imgs/times/nfc/oeste/49ers.png"));
        botao49ers.setText("San Francisco 49ers");
        botao49ers.setHorizontalAlignment(SwingConstants.LEFT);
        botao49ers.setHorizontalTextPosition(SwingConstants.RIGHT);
        botao49ers.addActionListener(TimesNFCController::botao49ersActionPerformed);

        botaoCardinals.setBackground(new Color(151, 35, 63));
        botaoCardinals.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoCardinals.setForeground(new Color(255, 182, 18));
        botaoCardinals.setIcon(new ImageIcon("./imgs/times/nfc/oeste/cardinals.png"));
        botaoCardinals.setText("Arizona Cardinals");
        botaoCardinals.setHorizontalAlignment(SwingConstants.LEFT);
        botaoCardinals.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoCardinals.addActionListener(TimesNFCController::botaoCardinalsActionPerformed);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoRams, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoCardinals, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botao49ers, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoSeahawks, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoCardinals)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoRams)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao49ers)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSeahawks)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        botaoPanthers.setBackground(new Color(0, 133, 202));
        botaoPanthers.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoPanthers.setForeground(new Color(16, 24, 32));
        botaoPanthers.setIcon(new ImageIcon("./imgs/times/nfc/sul/panthers.png"));
        botaoPanthers.setText("Carolina Panthers");
        botaoPanthers.setHorizontalAlignment(SwingConstants.LEFT);
        botaoPanthers.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoPanthers.addActionListener(TimesNFCController::botaoPanthersActionPerformed);

        botaoBuccaneers.setBackground(new Color(213, 10, 10));
        botaoBuccaneers.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoBuccaneers.setForeground(new Color(10, 10, 8));
        botaoBuccaneers.setIcon(new ImageIcon("./imgs/times/nfc/sul/buccaneers.png"));
        botaoBuccaneers.setText("Tampa Bay Buccaneers");
        botaoBuccaneers.setHorizontalAlignment(SwingConstants.LEFT);
        botaoBuccaneers.addActionListener(TimesNFCController::botaoBuccaneersActionPerformed);

        botaoSaints.setBackground(new Color(211, 188, 141));
        botaoSaints.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoSaints.setForeground(new Color(16, 24, 32));
        botaoSaints.setIcon(new ImageIcon("./imgs/times/nfc/sul/saints.png"));
        botaoSaints.setText("New Orleans Saints");
        botaoSaints.setHorizontalAlignment(SwingConstants.LEFT);
        botaoSaints.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoSaints.addActionListener(TimesNFCController::botaoSaintsActionPerformed);

        botaoFalcons.setBackground(new Color(167, 25, 48));
        botaoFalcons.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoFalcons.setForeground(new Color(0, 0, 0));
        botaoFalcons.setIcon(new ImageIcon("./imgs/times/nfc/sul/falcons.png"));
        botaoFalcons.setText("Atlanta Falcons");
        botaoFalcons.setHorizontalAlignment(SwingConstants.LEFT);
        botaoFalcons.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoFalcons.addActionListener(TimesNFCController::botaoFalconsActionPerformed);

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoPanthers, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoFalcons, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoSaints, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoBuccaneers, GroupLayout.DEFAULT_SIZE,
                                                236, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoFalcons)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPanthers)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSaints)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoBuccaneers)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addComponent(labelOeste)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelSul)
                                                .addGap(138, 138, 138))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelNorte)
                                                .addGap(106, 106, 106)
                                                .addComponent(labelNFC)
                                                .addGap(105, 105, 105)
                                                .addComponent(labelLeste)
                                                .addGap(119, 119, 119))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(labelNorte))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(labelLeste))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelNFC)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelOeste)
                                        .addComponent(labelSul))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(45, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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
            Logger.getLogger(TimesNFCAppSwing.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> new TimesNFCAppSwing().setVisible(true));
    }

}