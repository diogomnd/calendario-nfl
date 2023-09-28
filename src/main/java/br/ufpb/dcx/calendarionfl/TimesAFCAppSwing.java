package br.ufpb.dcx.calendarionfl;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.io.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimesAFCAppSwing extends JFrame {

    private static final GravadorDeDados gravador = new GravadorDeDados();

    public TimesAFCAppSwing() {
        setTitle("American Football Conference");
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
        JButton botaoBengals = new JButton();
        JButton botaoSteelers = new JButton();
        JButton botaoBrowns = new JButton();
        JButton botaoRavens = new JButton();
        JLabel jLabel6 = new JLabel();
        JPanel jPanel3 = new JPanel();
        JButton botaoDolphins = new JButton();
        JButton botaoJets = new JButton();
        JButton botaoPatriots = new JButton();
        JButton botaoBills = new JButton();
        JPanel jPanel4 = new JPanel();
        JButton botaoRaiders = new JButton();
        JButton botaoChiefs = new JButton();
        JButton botaoChargers = new JButton();
        JButton botaoBroncos = new JButton();
        JPanel jPanel5 = new JPanel();
        JButton botaoColts = new JButton();
        JButton botaoTitans = new JButton();
        JButton botaoJaguars = new JButton();
        JButton botaoTexans = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));

        jLabel1.setFont(new Font("NFL", Font.PLAIN, 18));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

        jLabel2.setFont(new Font("NFL", Font.PLAIN, 18));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("NORTE");

        jLabel3.setFont(new Font("NFL", Font.PLAIN, 18));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("LESTE");

        jLabel4.setFont(new Font("NFL", Font.PLAIN, 18));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("OESTE");

        jLabel5.setFont(new Font("NFL", Font.PLAIN, 18));
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("SUL");

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        botaoBengals.setBackground(new Color(251, 79, 20));
        botaoBengals.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoBengals.setForeground(new Color(0, 0, 0));
        botaoBengals.setIcon(new ImageIcon("./imgs/times/afc/norte/bengals.png"));
        botaoBengals.setText("Cincinatti Bengals");
        botaoBengals.setActionCommand("Cincinatti Bengals");
        botaoBengals.setHorizontalAlignment(SwingConstants.LEFT);
        botaoBengals.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoBengals.addActionListener(this::jButton2ActionPerformed);

        botaoSteelers.setBackground(new Color(0, 0, 0));
        botaoSteelers.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoSteelers.setForeground(new Color(255, 182, 18));
        botaoSteelers.setIcon(new ImageIcon("./imgs/times/afc/norte/steelers.png"));
        botaoSteelers.setText("Pittsburgh Steelers");
        botaoSteelers.setHorizontalAlignment(SwingConstants.LEFT);
        botaoSteelers.addActionListener(this::jButton4ActionPerformed);

        botaoBrowns.setBackground(new Color(49, 29, 0));
        botaoBrowns.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoBrowns.setForeground(new Color(255, 60, 0));
        botaoBrowns.setIcon(new ImageIcon("./imgs/times/afc/norte/browns.png"));
        botaoBrowns.setText("Cleveland Browns");
        botaoBrowns.setHorizontalAlignment(SwingConstants.LEFT);
        botaoBrowns.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoBrowns.addActionListener(this::jButton3ActionPerformed);

        botaoRavens.setBackground(new Color(36, 23, 115));
        botaoRavens.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoRavens.setForeground(new Color(0, 0, 0));
        botaoRavens.setIcon(new ImageIcon("./imgs/times/afc/norte/ravens.png"));
        botaoRavens.setText("Baltimore Ravens");
        botaoRavens.setHorizontalAlignment(SwingConstants.LEFT);
        botaoRavens.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoRavens.addActionListener(this::jButton1ActionPerformed);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoBengals, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoRavens, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoBrowns, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoSteelers, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoRavens)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoBengals)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoBrowns)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSteelers)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new ImageIcon("./imgs/icons/afc.png"));

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        botaoDolphins.setBackground(new Color(0, 142, 151));
        botaoDolphins.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoDolphins.setForeground(new Color(252, 76, 2));
        botaoDolphins.setIcon(new ImageIcon("./imgs/times/afc/leste/dolphins.png"));
        botaoDolphins.setText("Miami Dolphins");
        botaoDolphins.setHorizontalAlignment(SwingConstants.LEFT);
        botaoDolphins.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoDolphins.addActionListener(this::jButton5ActionPerformed);

        botaoJets.setBackground(new java.awt.Color(18, 87, 64));
        botaoJets.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoJets.setForeground(new java.awt.Color(255, 255, 255));
        botaoJets.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/leste/jets.png"));
        botaoJets.setText("New York Jets");
        botaoJets.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoJets.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoJets.addActionListener(this::jButton6ActionPerformed);

        botaoPatriots.setBackground(new java.awt.Color(0, 34, 68));
        botaoPatriots.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoPatriots.setForeground(new java.awt.Color(198, 12, 48));
        botaoPatriots.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/leste/patriots.png"));
        botaoPatriots.setText("New England Patriots");
        botaoPatriots.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoPatriots.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoPatriots.addActionListener(this::jButton7ActionPerformed);

        botaoBills.setBackground(new java.awt.Color(0, 51, 141));
        botaoBills.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoBills.setForeground(new java.awt.Color(198, 12, 48));
        botaoBills.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/leste/bills.png"));
        botaoBills.setText("Buffalo Bills");
        botaoBills.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoBills.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoBills.addActionListener(this::jButton8ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoDolphins, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoBills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoPatriots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoJets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoBills)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoDolphins)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPatriots)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoJets)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoRaiders.setBackground(new java.awt.Color(0, 0, 0));
        botaoRaiders.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoRaiders.setForeground(new java.awt.Color(165, 172, 175));
        botaoRaiders.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/oeste/raiders.png"));
        botaoRaiders.setText("Las Vegas Raiders");
        botaoRaiders.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoRaiders.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoRaiders.addActionListener(this::jButton9ActionPerformed);

        botaoChiefs.setBackground(new java.awt.Color(227, 24, 55));
        botaoChiefs.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoChiefs.setForeground(new java.awt.Color(255, 184, 28));
        botaoChiefs.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/oeste/chiefs.png"));
        botaoChiefs.setText("Kansas City Chiefs");
        botaoChiefs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoChiefs.addActionListener(this::jButton10ActionPerformed);

        botaoChargers.setBackground(new java.awt.Color(0, 128, 198));
        botaoChargers.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoChargers.setForeground(new java.awt.Color(255, 194, 14));
        botaoChargers.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/oeste/chargers.png"));
        botaoChargers.setText("Los Angeles Chargers");
        botaoChargers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoChargers.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoChargers.addActionListener(this::jButton11ActionPerformed);

        botaoBroncos.setBackground(new java.awt.Color(251, 79, 20));
        botaoBroncos.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoBroncos.setForeground(new java.awt.Color(0, 34, 68));
        botaoBroncos.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/oeste/broncos.png"));
        botaoBroncos.setText("Denver Broncos");
        botaoBroncos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoBroncos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoBroncos.addActionListener(this::jButton12ActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoRaiders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoBroncos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoChargers, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                        .addComponent(botaoChiefs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoBroncos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoRaiders)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoChargers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoChiefs)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoColts.setBackground(new java.awt.Color(0, 44, 95));
        botaoColts.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoColts.setForeground(new java.awt.Color(255, 255, 255));
        botaoColts.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/sul/colts.png"));
        botaoColts.setText("Indianapolis Colts");
        botaoColts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoColts.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoColts.addActionListener(this::jButton13ActionPerformed);

        botaoTitans.setBackground(new java.awt.Color(12, 35, 64));
        botaoTitans.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoTitans.setForeground(new java.awt.Color(75, 146, 219));
        botaoTitans.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/sul/titans.png"));
        botaoTitans.setText("Tennessee Titans");
        botaoTitans.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoTitans.addActionListener(this::jButton14ActionPerformed);

        botaoJaguars.setBackground(new java.awt.Color(0, 103, 120));
        botaoJaguars.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoJaguars.setForeground(new java.awt.Color(16, 24, 32));
        botaoJaguars.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/sul/jaguars.png"));
        botaoJaguars.setText("Jacksonville Jaguars");
        botaoJaguars.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoJaguars.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoJaguars.addActionListener(this::jButton15ActionPerformed);

        botaoTexans.setBackground(new java.awt.Color(3, 32, 47));
        botaoTexans.setFont(new java.awt.Font("NFL", Font.PLAIN, 12));
        botaoTexans.setForeground(new java.awt.Color(167, 25, 48));
        botaoTexans.setIcon(new javax.swing.ImageIcon("./imgs/times/afc/sul/texans.png"));
        botaoTexans.setText("Houston Texans");
        botaoTexans.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoTexans.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoTexans.addActionListener(this::jButton16ActionPerformed);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoColts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoTexans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoJaguars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoTitans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoTexans)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoColts)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoJaguars)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoTitans)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(38, 38, 38))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(132, 132, 132))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(111, 111, 111)
                                                .addComponent(jLabel6)
                                                .addGap(100, 100, 100)
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
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel6)))
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

    private void jButton1ActionPerformed(ActionEvent evt) {
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

    private void jButton2ActionPerformed(ActionEvent evt) {
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

    private void jButton3ActionPerformed(ActionEvent evt) {
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

    private void jButton4ActionPerformed(ActionEvent evt) {
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

    private void jButton8ActionPerformed(ActionEvent evt) {
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

    private void jButton5ActionPerformed(ActionEvent evt) {
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

    private void jButton7ActionPerformed(ActionEvent evt) {
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

    private void jButton6ActionPerformed(ActionEvent evt) {
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

    private void jButton12ActionPerformed(ActionEvent evt) {
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

    private void jButton9ActionPerformed(ActionEvent evt) {
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

    private void jButton11ActionPerformed(ActionEvent evt) {
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

    private void jButton10ActionPerformed(ActionEvent evt) {
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

    private void jButton16ActionPerformed(ActionEvent evt) {
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

    private void jButton13ActionPerformed(ActionEvent evt) {
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

    private void jButton15ActionPerformed(ActionEvent evt) {
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

    private void jButton14ActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(TimesAFCAppSwing.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> new TimesAFCAppSwing().setVisible(true));
    }
}