package br.ufpb.dcx.calendarionfl;

import javax.swing.*;
import java.awt.*;

public class CalendarioNFLGUI extends JFrame{
    JLabel linha1, linha2;
    ImageIcon logoNFL = new ImageIcon("./imgs/nfl-logo-6.png");
    ImageIcon addAFC = new ImageIcon("./imgs/icons/afc.png");
    ImageIcon addNFC = new ImageIcon("./imgs/icons/nfc.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove_person.png");
    JButton botaoAFC, botaoNFC, botaoRemover;
    GravadorDeDados agenda = new GravadorDeDados();

    public CalendarioNFLGUI() {
        setTitle("Calendario da NFL 2023");
        setSize(1000,800); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("Calendario da NFL 2023", JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("NFL", Font.PLAIN, 24));
        linha2 = new JLabel(logoNFL, JLabel.CENTER);
        botaoAFC = new JButton("American Football Conference", addAFC);
        //botaoAdicionar.addActionListener(new AgendaAddController(agenda, this));
        botaoNFC = new JButton("National Football Conference", addNFC);
        //botaoPesquisar.addActionListener(new AgendaSearchController(agenda, this));
        //botaoRemover = new JButton("Remover",removeImg);
        //botaoRemover.addActionListener(new AgendaRemoveController(agenda, this));
        getContentPane().setLayout(new GridLayout(3,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAFC);
        getContentPane().add(linha2);
        getContentPane().add(botaoNFC);
        getContentPane().add(new JLabel());
        //getContentPane().add(botaoRemover);
    }
    //...
    public static void main(String [] args){
        JFrame janela = new CalendarioNFLGUI();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}