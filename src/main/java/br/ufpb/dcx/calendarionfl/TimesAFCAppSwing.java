package br.ufpb.dcx.calendarionfl;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimesAFCAppSwing extends JFrame {

    public TimesAFCAppSwing() {
        setTitle("American Football Conference");
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
        JLabel labelAFC = new JLabel();
        JLabel labelNorte = new JLabel();
        JLabel labelLeste = new JLabel();
        JLabel labelOeste = new JLabel();
        JLabel labelSul = new JLabel();
        JButton botaoRavens = new JButton();
        JButton botaoBengals = new JButton();
        JButton botaoBrowns = new JButton();
        JButton botaoSteelers = new JButton();
        JButton botaoBills = new JButton();
        JButton botaoDolphins = new JButton();
        JButton botaoPatriots = new JButton();
        JButton botaoJets = new JButton();
        JButton botaoBroncos = new JButton();
        JButton botaoRaiders = new JButton();
        JButton botaoChargers = new JButton();
        JButton botaoChiefs = new JButton();
        JButton botaoTexans = new JButton();
        JButton botaoColts = new JButton();
        JButton botaoJaguars = new JButton();
        JButton botaoTitans = new JButton();

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

        botaoBengals.setBackground(new Color(251, 79, 20));
        botaoBengals.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoBengals.setForeground(new Color(0, 0, 0));
        botaoBengals.setIcon(new ImageIcon("./imgs/times/afc/norte/bengals.png"));
        botaoBengals.setText("Cincinatti Bengals");
        botaoBengals.setActionCommand("Cincinatti Bengals");
        botaoBengals.setHorizontalAlignment(SwingConstants.LEFT);
        botaoBengals.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoBengals.addActionListener(TimesAFCController::botaoBengalsActionPerformed);

        botaoSteelers.setBackground(new Color(0, 0, 0));
        botaoSteelers.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoSteelers.setForeground(new Color(255, 182, 18));
        botaoSteelers.setIcon(new ImageIcon("./imgs/times/afc/norte/steelers.png"));
        botaoSteelers.setText("Pittsburgh Steelers");
        botaoSteelers.setHorizontalAlignment(SwingConstants.LEFT);
        botaoSteelers.addActionListener(TimesAFCController::botaoSteelersActionPerformed);

        botaoBrowns.setBackground(new Color(49, 29, 0));
        botaoBrowns.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoBrowns.setForeground(new Color(255, 60, 0));
        botaoBrowns.setIcon(new ImageIcon("./imgs/times/afc/norte/browns.png"));
        botaoBrowns.setText("Cleveland Browns");
        botaoBrowns.setHorizontalAlignment(SwingConstants.LEFT);
        botaoBrowns.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoBrowns.addActionListener(TimesAFCController::botaoBrownsActionPerformed);

        botaoRavens.setBackground(new Color(36, 23, 115));
        botaoRavens.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoRavens.setForeground(new Color(0, 0, 0));
        botaoRavens.setIcon(new ImageIcon("./imgs/times/afc/norte/ravens.png"));
        botaoRavens.setText("Baltimore Ravens");
        botaoRavens.setHorizontalAlignment(SwingConstants.LEFT);
        botaoRavens.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoRavens.addActionListener(TimesAFCController::botaoRavensActionPerformed);

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

        labelAFC.setIcon(new ImageIcon("./imgs/icons/afc.png"));

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        botaoDolphins.setBackground(new Color(0, 142, 151));
        botaoDolphins.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoDolphins.setForeground(new Color(252, 76, 2));
        botaoDolphins.setIcon(new ImageIcon("./imgs/times/afc/leste/dolphins.png"));
        botaoDolphins.setText("Miami Dolphins");
        botaoDolphins.setHorizontalAlignment(SwingConstants.LEFT);
        botaoDolphins.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoDolphins.addActionListener(TimesAFCController::botaoDolphinsActionPerformed);

        botaoJets.setBackground(new Color(18, 87, 64));
        botaoJets.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoJets.setForeground(new Color(255, 255, 255));
        botaoJets.setIcon(new ImageIcon("./imgs/times/afc/leste/jets.png"));
        botaoJets.setText("New York Jets");
        botaoJets.setHorizontalAlignment(SwingConstants.LEFT);
        botaoJets.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoJets.addActionListener(TimesAFCController::botaoJetsActionPerformed);

        botaoPatriots.setBackground(new Color(0, 34, 68));
        botaoPatriots.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoPatriots.setForeground(new Color(198, 12, 48));
        botaoPatriots.setIcon(new ImageIcon("./imgs/times/afc/leste/patriots.png"));
        botaoPatriots.setText("New England Patriots");
        botaoPatriots.setHorizontalAlignment(SwingConstants.LEFT);
        botaoPatriots.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoPatriots.addActionListener(TimesAFCController::botaoPatriotsActionPerformed);

        botaoBills.setBackground(new Color(0, 51, 141));
        botaoBills.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoBills.setForeground(new Color(198, 12, 48));
        botaoBills.setIcon(new ImageIcon("./imgs/times/afc/leste/bills.png"));
        botaoBills.setText("Buffalo Bills");
        botaoBills.setHorizontalAlignment(SwingConstants.LEFT);
        botaoBills.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoBills.addActionListener(TimesAFCController::botaoBillsActionPerformed);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoDolphins, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoBills, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoPatriots, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoJets, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoBills)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoDolphins)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPatriots)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoJets)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        botaoRaiders.setBackground(new Color(0, 0, 0));
        botaoRaiders.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoRaiders.setForeground(new Color(165, 172, 175));
        botaoRaiders.setIcon(new ImageIcon("./imgs/times/afc/oeste/raiders.png"));
        botaoRaiders.setText("Las Vegas Raiders");
        botaoRaiders.setHorizontalAlignment(SwingConstants.LEFT);
        botaoRaiders.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoRaiders.addActionListener(TimesAFCController::botaoRaidersActionPerformed);

        botaoChiefs.setBackground(new Color(227, 24, 55));
        botaoChiefs.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoChiefs.setForeground(new Color(255, 184, 28));
        botaoChiefs.setIcon(new ImageIcon("./imgs/times/afc/oeste/chiefs.png"));
        botaoChiefs.setText("Kansas City Chiefs");
        botaoChiefs.setHorizontalAlignment(SwingConstants.LEFT);
        botaoChiefs.addActionListener(TimesAFCController::botaoChiefsActionPerformed);

        botaoChargers.setBackground(new Color(0, 128, 198));
        botaoChargers.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoChargers.setForeground(new Color(255, 194, 14));
        botaoChargers.setIcon(new ImageIcon("./imgs/times/afc/oeste/chargers.png"));
        botaoChargers.setText("Los Angeles Chargers");
        botaoChargers.setHorizontalAlignment(SwingConstants.LEFT);
        botaoChargers.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoChargers.addActionListener(TimesAFCController::botaoChargersActionPerformed);

        botaoBroncos.setBackground(new Color(251, 79, 20));
        botaoBroncos.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoBroncos.setForeground(new Color(0, 34, 68));
        botaoBroncos.setIcon(new ImageIcon("./imgs/times/afc/oeste/broncos.png"));
        botaoBroncos.setText("Denver Broncos");
        botaoBroncos.setHorizontalAlignment(SwingConstants.LEFT);
        botaoBroncos.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoBroncos.addActionListener(TimesAFCController::botaoBroncosActionPerformed);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoRaiders, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoBroncos, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoChargers, GroupLayout.DEFAULT_SIZE,
                                                226, Short.MAX_VALUE)
                                        .addComponent(botaoChiefs, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoBroncos)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoRaiders)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoChargers)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoChiefs)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        botaoColts.setBackground(new Color(0, 44, 95));
        botaoColts.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoColts.setForeground(new Color(255, 255, 255));
        botaoColts.setIcon(new ImageIcon("./imgs/times/afc/sul/colts.png"));
        botaoColts.setText("Indianapolis Colts");
        botaoColts.setHorizontalAlignment(SwingConstants.LEFT);
        botaoColts.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoColts.addActionListener(TimesAFCController::botaoColtsActionPerformed);

        botaoTitans.setBackground(new Color(12, 35, 64));
        botaoTitans.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoTitans.setForeground(new Color(75, 146, 219));
        botaoTitans.setIcon(new ImageIcon("./imgs/times/afc/sul/titans.png"));
        botaoTitans.setText("Tennessee Titans");
        botaoTitans.setHorizontalAlignment(SwingConstants.LEFT);
        botaoTitans.addActionListener(TimesAFCController::botaoTitansActionPerformed);

        botaoJaguars.setBackground(new Color(0, 103, 120));
        botaoJaguars.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoJaguars.setForeground(new Color(16, 24, 32));
        botaoJaguars.setIcon(new ImageIcon("./imgs/times/afc/sul/jaguars.png"));
        botaoJaguars.setText("Jacksonville Jaguars");
        botaoJaguars.setHorizontalAlignment(SwingConstants.LEFT);
        botaoJaguars.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoJaguars.addActionListener(TimesAFCController::botaoJaguarsActionPerformed);

        botaoTexans.setBackground(new Color(3, 32, 47));
        botaoTexans.setFont(new Font("NFL", Font.PLAIN, 12));
        botaoTexans.setForeground(new Color(167, 25, 48));
        botaoTexans.setIcon(new ImageIcon("./imgs/times/afc/sul/texans.png"));
        botaoTexans.setText("Houston Texans");
        botaoTexans.setHorizontalAlignment(SwingConstants.LEFT);
        botaoTexans.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoTexans.addActionListener(TimesAFCController::botaoTexansActionPerformed);

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoColts, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoTexans, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoJaguars, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoTitans, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoTexans)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoColts)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoJaguars)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoTitans)
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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(38, 38, 38))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelSul)
                                                .addGap(132, 132, 132))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelNorte)
                                                .addGap(111, 111, 111)
                                                .addComponent(labelAFC)
                                                .addGap(100, 100, 100)
                                                .addComponent(labelLeste)
                                                .addGap(119, 119, 119))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(labelNorte)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelOeste)
                                                        .addComponent(labelSul)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(labelLeste)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(labelAFC)))
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
            Logger.getLogger(TimesAFCAppSwing.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> new TimesAFCAppSwing().setVisible(true));
    }

}