package Duel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import Challenger.Container.Container1;
import Challenger.Container.Container2;
import Challenger.Container.Container3;
import Challenger.Container.Container4;

import Challenger.Reponse.*;

public class PanelJoueur1 extends JPanel{
	public JPanel panC = new JPanel() ;
	public JPanel panR = new JPanel() ;
	
	private Container1 A1 = new Container1();
	private Container2 A2 = new Container2();
	private Container3 A3 = new Container3();
	private Container4 A4 = new Container4();
	private Reponse1 R1 = new Reponse1();
	private Reponse2 R2 = new Reponse2();
	private Reponse3 R3 = new Reponse3();
	private Reponse4 R4 = new Reponse4();
	
	
	PanelJoueur1(){
		A1.setPreferredSize(new Dimension(100, 100));
		A2.setPreferredSize(new Dimension(100, 100));
		A3.setPreferredSize(new Dimension(100, 100));
		A4.setPreferredSize(new Dimension(100, 100));
		R1.setPreferredSize(new Dimension(100, 100));
		R2.setPreferredSize(new Dimension(100, 100));
		R3.setPreferredSize(new Dimension(100, 100));
		R4.setPreferredSize(new Dimension(100, 100));
		 this.setLayout(new GridLayout(1, 4, 5, 5));
		 this.setSize(660,462);
		 this.add(panC, BorderLayout.NORTH);
		panC.add(A1);
		panC.add(A2);
		panC.add(A3);
		panC.add(A4);
		
		 this.add(panR, BorderLayout.SOUTH);
		panR.add(R1);
		panR.add(R2);
		panR.add(R3);
		panR.add(R4);
		
	}
	
}
