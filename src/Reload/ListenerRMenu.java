package Reload ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import BOT.IA;
import Challenger.Reponse.Reponse1;
import Challenger.Reponse.Reponse2;
import Challenger.Reponse.Reponse3;
import Challenger.Reponse.Reponse4;
import ListenerModJeu.ModJeu;
import Reload.* ;
import Reponse.Reponses;
public class ListenerRMenu extends JPanel implements ActionListener {


JButton RMenu = new JButton("Retour au Menu");
		
	
	public  ListenerRMenu() {
		this.add(RMenu);
	    RMenu.addActionListener( this);
	    RMenu.setBackground(Color.WHITE);
	    RMenu.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 		Duel.ProchainTour.p = 0 ;
		BOT.Comparateur.pp = 0 ;
		Reponses.pp = 0 ;
		IA.p = 0 ;
		BOT.ProchainTour.p = 0 ;
 		new ModJeu() ;	
 		new Reponses();
 		new Reponse1();
 		new Reponse2();
 		new Reponse3();
 		new Reponse4();
 		
   
 	}
 	
}