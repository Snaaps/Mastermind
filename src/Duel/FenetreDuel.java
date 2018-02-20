package Duel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class FenetreDuel extends JFrame  {
	PanelJoueur1 panJoueur = new PanelJoueur1() ;
	JPanel panIA = new JPanel() ;

	public FenetreDuel() {
	this.add(panJoueur, BorderLayout.WEST);
	this.add(panIA, BorderLayout.EAST);
	this.add(panJoueur);
    this.setTitle("MASTERMIND") ;
    this.setSize(1320,725);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    
   // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}