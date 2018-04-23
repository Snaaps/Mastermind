package Challenger;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class panValider extends JPanel{
	Valider val = new Valider();
	//GridLayout GL = new GridLayout(2, 10, 10, 10);
 public panValider() {
	 this.add(val, BorderLayout.SOUTH);
	 //this.setBackground(Color.white);
	// this.setLayout(GL);
	// val.setBounds(0, 625, 1310, 50);
	 this.add(val);
	// val.setLayout(G);
 }
}
