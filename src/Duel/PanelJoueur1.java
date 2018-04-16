package Duel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import Duel.Container.Container1;
import Duel.Container.Container2;
import Duel.Container.Container3;
import Duel.Container.Container4;

import Duel.Reponse.*;
import BOT.DContainer.*;
import BOT.Comparateur;
import BOT.ProchainTour;
public class PanelJoueur1 extends JPanel{
	public ProchainTour PT = new ProchainTour();
	public JPanel panPT = new JPanel();
	public JPanel panIA = new JPanel() ;
	public JPanel panC = new JPanel() ;
	public JPanel panR = new JPanel() ;

	private Container1 A1 = new Container1();
	private Container2 A2 = new Container2();
	private Container3 A3 = new Container3();
	private Container4 A4 = new Container4();

	
	
	PanelJoueur1(){
		
		A1.setPreferredSize(new Dimension(100, 100));
		A2.setPreferredSize(new Dimension(100, 100));
		A3.setPreferredSize(new Dimension(100, 100));
		A4.setPreferredSize(new Dimension(100, 100));
		
		 this.setLayout(new GridLayout(1, 3, 5, 5));
		 this.setBounds(50, 400, 600, 150);
		 this.add(panC);
		 JLabel jlabel = new JLabel("Joueur");
		    jlabel.setFont(new Font("Verdana",1,20));
		    panC.add(jlabel);
		    panC.setBorder( new LineBorder(Color.BLACK)); // make it easy to see
		  //this.add(panC, new GridBagConstraints());
		panC.add(A1);
		panC.add(A2);
		panC.add(A3);
		panC.add(A4);
		
		
	}
	
}
