package Duel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import com.sun.prism.paint.Color;

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
	private DContainer1 IA1 = new DContainer1();
	private DContainer2 IA2 = new DContainer2();
	private DContainer3 IA3 = new DContainer3();
	private DContainer4 IA4 = new DContainer4();
	private Container1 A1 = new Container1();
	private Container2 A2 = new Container2();
	private Container3 A3 = new Container3();
	private Container4 A4 = new Container4();
	public static Reponse1 R1 = new Reponse1();
	public static Reponse2 R2 = new Reponse2();
	public static Reponse3 R3 = new Reponse3();
	public static Reponse4 R4 = new Reponse4();
	
	
	PanelJoueur1(){
		IA1.setPreferredSize(new Dimension(100, 100));
		IA2.setPreferredSize(new Dimension(100, 100));
		IA3.setPreferredSize(new Dimension(100, 100));
		IA4.setPreferredSize(new Dimension(100, 100));
		A1.setPreferredSize(new Dimension(100, 100));
		A2.setPreferredSize(new Dimension(100, 100));
		A3.setPreferredSize(new Dimension(100, 100));
		A4.setPreferredSize(new Dimension(100, 100));
		R1.setPreferredSize(new Dimension(100, 100));
		R2.setPreferredSize(new Dimension(100, 100));
		R3.setPreferredSize(new Dimension(100, 100));
		R4.setPreferredSize(new Dimension(100, 100));
		 this.setLayout(new GridLayout(1, 3, 5, 5));
		 this.setSize(660,462);
		 this.add(panC, BorderLayout.NORTH);
		 JLabel jlabel = new JLabel("Joueur");
		    jlabel.setFont(new Font("Verdana",1,20));
		    panC.add(jlabel);
		   // panC.setBorder( new LineBorder(Color.BLACK)); // make it easy to see
		  //this.add(panC, new GridBagConstraints());
		panC.add(A1);
		panC.add(A2);
		panC.add(A3);
		panC.add(A4);
		 this.add(panIA, BorderLayout.EAST);
		 JLabel jlabel1 = new JLabel("IA");
		    jlabel1.setFont(new Font("Verdana",1,20));
		    panIA.add(jlabel1);
		panIA.add(IA1);
		panIA.add(IA2);
		panIA.add(IA3);
		panIA.add(IA4);
		 this.add(panR, BorderLayout.SOUTH);
		 JLabel jlabel2 = new JLabel("Correction");
		    jlabel2.setFont(new Font("Verdana",1,20));
		    panR.add(jlabel2);
		panR.add(R1);
		panR.add(R2);
		panR.add(R3);
		panR.add(R4);
		this.add(panPT, BorderLayout.SOUTH);
		panPT.add(PT);
		
	}
	
}
