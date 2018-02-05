package Defenseur;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreJeu extends JFrame  {
	JPanel pan1 = new JPanel() ;
	JFrame fen = new JFrame() ;
	
	
	
	public FenetreJeu() {
    this.setTitle("MASTERMIND") ;
    this.setSize(1320,725);
    this.setLocationRelativeTo(null);
   // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  //  this.getContentPane().add(PRJ, BorderLayout.NORTH);
}
}