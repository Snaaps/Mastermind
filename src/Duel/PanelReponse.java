package Duel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Duel.Reponse.Reponse1;
import Duel.Reponse.Reponse2;
import Duel.Reponse.Reponse3;
import Duel.Reponse.Reponse4;

public class PanelReponse extends JPanel{
	static JPanel PanRep = new JPanel();
	private Reponse1 Rep1 = new Reponse1();
	private Reponse2 Rep2 = new Reponse2();
	private Reponse3 Rep3 = new Reponse3();
	private Reponse4 Rep4 = new Reponse4();
	
	 PanelReponse(){
		 	Rep1.setPreferredSize(new Dimension(100, 100));
			Rep2.setPreferredSize(new Dimension(100, 100));
			Rep3.setPreferredSize(new Dimension(100, 100));
			Rep4.setPreferredSize(new Dimension(100, 100));
		
			this.setBounds(50, 100, 600, 150);
		
		 this.add(PanRep);
		 JLabel jlabel = new JLabel("Reponse");
		    jlabel.setFont(new Font("Verdana",1,20));
		    PanRep.add(jlabel);
		    PanRep.setBorder( new LineBorder(Color.BLACK)); // make it easy to see
		 this.setLayout(new GridLayout(1, 4, 5, 5));
		this.add(Rep1);
		this.add(Rep2);
		this.add(Rep3);
		this.add(Rep4);
	}
	
}