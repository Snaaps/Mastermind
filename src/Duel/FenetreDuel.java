package Duel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Defenseur.Valider;
import ListenerMENU.Main;


public class FenetreDuel   {

	PanelJoueur1 panJoueur = new PanelJoueur1() ;
	PanelIA panIA = new PanelIA() ;
	PanelReponse PanRep = new PanelReponse() ;
	 ProchainTour Val = new ProchainTour();
	 public static JFrame fenDuel = new JFrame(); 
	 
	 
	public FenetreDuel() {
		panJoueur.setPreferredSize(new Dimension(100, 100)); 
		panIA.setPreferredSize(new Dimension(100, 100)); 
		PanRep.setPreferredSize(new Dimension(100, 100)); 
		Val.setBounds(700, 400, 200, 300);
	fenDuel.add(panJoueur);
	fenDuel.add(panIA);
	fenDuel.add(PanRep);
	fenDuel.add(Val);
    fenDuel.setTitle("MASTERMIND") ;
    fenDuel.setSize(1320,725);
    fenDuel.setLocationRelativeTo(null);
    ListenerModJeu.ModJeu.ModJeu.setVisible(false);
    fenDuel.setVisible(true);
    
   // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}