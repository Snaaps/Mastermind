package Duel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import BOT.IA;
import BOT.DContainer.DContainer1;
import BOT.DContainer.DContainer2;
import BOT.DContainer.DContainer3;
import BOT.DContainer.DContainer4;



public class PanelIA extends JPanel{
	static JPanel panIA = new JPanel();
	 static DContainer1 IABu1 = IA.IABu1;
	 static DContainer2 IABu2 = IA.IABu2;
	 static DContainer3 IABu3 = IA.IABu3;
	 static DContainer4 IABu4 = IA.IABu4;
	 
	
	PanelIA(){
		IABu1.setPreferredSize(new Dimension(100, 100));
		IABu2.setPreferredSize(new Dimension(100, 100));
		IABu3.setPreferredSize(new Dimension(100, 100));
		IABu4.setPreferredSize(new Dimension(100, 100));
		Color();
		 this.setLayout(new GridLayout(1, 4, 5, 5));
		 this.setBounds(700, 100, 600, 150);
		 this.add(panIA);
		 JLabel jlabel = new JLabel("IA");
		    jlabel.setFont(new Font("Verdana",1,20));
		    panIA.add(jlabel);
		this.add(IABu1);
		this.add(IABu2);
		this.add(IABu3);
		this.add(IABu4);
		
		
		panIA.setBorder( new LineBorder(Color.BLACK));
	}
	public static void Color(){
		IA.IABu1.IACouleur(); 
		IA.IABu2.IACouleur(); 
		IA.IABu3.IACouleur(); 
		IA.IABu4.IACouleur();
	}
	
}