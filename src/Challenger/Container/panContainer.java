package Challenger.Container;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Challenger.Reponse.*;

public class panContainer extends JPanel{
	private Reponse1 A1 = new Reponse1();
	private Reponse2 A2 = new Reponse2();
	private Reponse3 A3 = new Reponse3();
	private Reponse4 A4 = new Reponse4();
	
	public panContainer() {
		this.setBounds(0, 300, 1310, 300);
		this.setBackground(Color.RED);
		//this.setLayout(new GridLayout(1, 4, 50, 50));
		
		this.add(A1);
		this.add(A2);
		this.add(A3);
		this.add(A4);
	}
}
