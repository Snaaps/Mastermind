package Duel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Defenseur.Valider;


public class FenetreDuel extends JFrame  {
	PanelJoueur1 panJoueur = new PanelJoueur1() ;
	PanelIA panIA = new PanelIA() ;
	PanelReponse PanRep = new PanelReponse() ;
	 ProchainTour Val = new ProchainTour();
	 
	 
	public FenetreDuel() {
		panJoueur.setPreferredSize(new Dimension(100, 100)); 
		panIA.setPreferredSize(new Dimension(100, 100)); 
		PanRep.setPreferredSize(new Dimension(100, 100)); 
		Val.setBounds(700, 400, 200, 300);
	this.add(panJoueur);
	this.add(panIA);
	this.add(PanRep);
	this.add(Val);
    this.setTitle("MASTERMIND") ;
    this.setSize(1320,725);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    
   // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}