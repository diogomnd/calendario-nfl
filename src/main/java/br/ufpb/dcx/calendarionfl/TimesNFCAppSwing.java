package br.ufpb.dcx.calendarionfl;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Map;

public class TimesNFCAppSwing extends javax.swing.JFrame {
    private static final GravadorDeDados gravador = new GravadorDeDados();

    public TimesNFCAppSwing() {
        setTitle("National Football Conference");
        setResizable(false);
        initComponents();
    }

    @SuppressWarnings("Unchecked")
    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JPanel jPanel2 = new JPanel();
        JButton botaoLions = new JButton();
        JButton botaoVikings = new JButton();
        JButton botaoPackers = new JButton();
        JButton botaoBears = new JButton();
        JLabel jLabel6 = new JLabel();
        JPanel jPanel3 = new JPanel();
        JButton botaoGiants = new JButton();
        JButton botaoCommanders = new JButton();
        JButton botaoEagles = new JButton();
        JButton botaoCowboys = new JButton();
        JPanel jPanel4 = new JPanel();
        JButton botaoRams = new JButton();
        JButton botaoSeahawks = new JButton();
        JButton botao49ers = new JButton();
        JButton botaoCardinals = new JButton();
        JPanel jPanel5 = new JPanel();
        JButton botaoPanthers = new JButton();
        JButton botaoBuccaneers = new JButton();
        JButton botaoSaints = new JButton();
        JButton botaoFalcons = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("NFL", Font.PLAIN, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("NFL", Font.PLAIN, 18));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NORTE");

        jLabel3.setFont(new java.awt.Font("NFL", Font.PLAIN, 18));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LESTE");

        jLabel4.setFont(new java.awt.Font("NFL", Font.PLAIN, 18));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("OESTE");

        jLabel5.setFont(new java.awt.Font("NFL", Font.PLAIN, 18));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SUL");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoLions.setBackground(new java.awt.Color(0, 118, 182));
        botaoLions.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoLions.setForeground(new java.awt.Color(176, 183, 188));
        botaoLions.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/norte/lions.png"));
        botaoLions.setText("Detroit Lions");
        botaoLions.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoLions.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoLions.addActionListener(this::jButton2ActionPerformed);

        botaoVikings.setBackground(new java.awt.Color(79, 38, 131));
        botaoVikings.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoVikings.setForeground(new java.awt.Color(255, 198, 47));
        botaoVikings.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/norte/vikings.png"));
        botaoVikings.setText("Minnesota Vikings");
        botaoVikings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoVikings.addActionListener(this::jButton4ActionPerformed);

        botaoPackers.setBackground(new java.awt.Color(32, 55, 49));
        botaoPackers.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoPackers.setForeground(new java.awt.Color(255, 184, 28));
        botaoPackers.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/norte/packers.png"));
        botaoPackers.setText("Green Bay Packers");
        botaoPackers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoPackers.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoPackers.addActionListener(this::jButton3ActionPerformed);

        botaoBears.setBackground(new java.awt.Color(11, 22, 42));
        botaoBears.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoBears.setForeground(new java.awt.Color(200, 56, 3));
        botaoBears.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/norte/bears.png"));
        botaoBears.setText("Chicago Bears");
        botaoBears.setHideActionText(true);
        botaoBears.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoBears.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoBears.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoLions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoBears, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoPackers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoVikings, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoBears)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoLions)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPackers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoVikings)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon("./imgs/icons/nfc.png"));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoGiants.setBackground(new java.awt.Color(1, 35, 82));
        botaoGiants.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoGiants.setForeground(new java.awt.Color(163, 13, 45));
        botaoGiants.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/leste/giants.png"));
        botaoGiants.setText("New York Giants");
        botaoGiants.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoGiants.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoGiants.addActionListener(this::jButton5ActionPerformed);

        botaoCommanders.setBackground(new java.awt.Color(90, 20, 20));
        botaoCommanders.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoCommanders.setForeground(new java.awt.Color(255, 182, 18));
        botaoCommanders.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/leste/commanders.png"));
        botaoCommanders.setText("Washington Commanders");
        botaoCommanders.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoCommanders.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoCommanders.addActionListener(this::jButton6ActionPerformed);

        botaoEagles.setBackground(new java.awt.Color(0, 76, 84));
        botaoEagles.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoEagles.setForeground(new java.awt.Color(165, 172, 175));
        botaoEagles.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/leste/eagles.png"));
        botaoEagles.setText("Philadelphia Eagles");
        botaoEagles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoEagles.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoEagles.addActionListener(this::jButton7ActionPerformed);

        botaoCowboys.setBackground(new java.awt.Color(4, 30, 66));
        botaoCowboys.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoCowboys.setForeground(new java.awt.Color(137, 147, 151));
        botaoCowboys.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/leste/cowboys.png"));
        botaoCowboys.setText("Dallas Cowboys");
        botaoCowboys.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoCowboys.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoCowboys.addActionListener(this::jButton8ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoGiants, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoCowboys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoEagles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoCommanders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoCowboys)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoGiants)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoEagles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoCommanders)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoRams.setBackground(new java.awt.Color(0, 53, 148));
        botaoRams.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoRams.setForeground(new java.awt.Color(255, 163, 0));
        botaoRams.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/oeste/rams.png"));
        botaoRams.setText("Los Angeles Rams");
        botaoRams.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoRams.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoRams.addActionListener(this::jButton9ActionPerformed);

        botaoSeahawks.setBackground(new java.awt.Color(0, 34, 68));
        botaoSeahawks.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoSeahawks.setForeground(new java.awt.Color(105, 190, 40));
        botaoSeahawks.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/oeste/seahawks.png"));
        botaoSeahawks.setText("Seattle Seahawks");
        botaoSeahawks.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoSeahawks.addActionListener(this::jButton10ActionPerformed);

        botao49ers.setBackground(new java.awt.Color(170, 0, 0));
        botao49ers.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botao49ers.setForeground(new java.awt.Color(173, 153, 93));
        botao49ers.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/oeste/49ers.png"));
        botao49ers.setText("San Francisco 49ers");
        botao49ers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botao49ers.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botao49ers.addActionListener(this::jButton11ActionPerformed);

        botaoCardinals.setBackground(new java.awt.Color(151, 35, 63));
        botaoCardinals.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoCardinals.setForeground(new java.awt.Color(255, 182, 18));
        botaoCardinals.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/oeste/cardinals.png"));
        botaoCardinals.setText("Arizona Cardinals");
        botaoCardinals.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoCardinals.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoCardinals.addActionListener(this::jButton12ActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoRams, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoCardinals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botao49ers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoSeahawks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoCardinals)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoRams)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao49ers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSeahawks)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoPanthers.setBackground(new java.awt.Color(0, 133, 202));
        botaoPanthers.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoPanthers.setForeground(new java.awt.Color(16, 24, 32));
        botaoPanthers.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/sul/panthers.png"));
        botaoPanthers.setText("Carolina Panthers");
        botaoPanthers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoPanthers.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoPanthers.addActionListener(this::jButton13ActionPerformed);

        botaoBuccaneers.setBackground(new java.awt.Color(213, 10, 10));
        botaoBuccaneers.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoBuccaneers.setForeground(new java.awt.Color(10, 10, 8));
        botaoBuccaneers.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/sul/buccaneers.png"));
        botaoBuccaneers.setText("Tampa Bay Buccaneers");
        botaoBuccaneers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoBuccaneers.addActionListener(this::jButton14ActionPerformed);

        botaoSaints.setBackground(new java.awt.Color(211, 188, 141));
        botaoSaints.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoSaints.setForeground(new java.awt.Color(16, 24, 32));
        botaoSaints.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/sul/saints.png"));
        botaoSaints.setText("New Orleans Saints");
        botaoSaints.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoSaints.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoSaints.addActionListener(this::jButton15ActionPerformed);

        botaoFalcons.setBackground(new java.awt.Color(167, 25, 48));
        botaoFalcons.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoFalcons.setForeground(new java.awt.Color(0, 0, 0));
        botaoFalcons.setIcon(new javax.swing.ImageIcon("./imgs/times/nfc/sul/falcons.png"));
        botaoFalcons.setText("Atlanta Falcons");
        botaoFalcons.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoFalcons.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoFalcons.addActionListener(this::jButton16ActionPerformed);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoPanthers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoFalcons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoSaints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoBuccaneers, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoFalcons)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPanthers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSaints)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoBuccaneers)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(138, 138, 138))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(106, 106, 106)
                                                .addComponent(jLabel6)
                                                .addGap(105, 105, 105)
                                                .addComponent(jLabel3)
                                                .addGap(119, 119, 119))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
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

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimesNFCAppSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new TimesNFCAppSwing().setVisible(true));
    }

}