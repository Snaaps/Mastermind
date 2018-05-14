package Reload ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

import BOT.IA;
import Challenger.Reponse.Reponse1;
import Challenger.Reponse.Reponse2;
import Challenger.Reponse.Reponse3;
import Challenger.Reponse.Reponse4;
import ListenerMENU.DomParser;
import ListenerMENU.Main;
import ListenerModJeu.ModJeu;
import Reload.* ;
import Reponse.Reponses;
public class ListenerRMenu extends JPanel implements ActionListener {


JButton RMenu = new JButton("Retour au Menu");
static int NbCouleur = DomParser.NbCouleur  ;
static Random r = new Random();
	
	public  ListenerRMenu() {
		this.add(RMenu);
	    RMenu.addActionListener( this);
	    RMenu.setBackground(Color.WHITE);
	    RMenu.setPreferredSize(new Dimension(300, 100));
	    
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 		BOT.IA.valC1 = 0;
 		BOT.IA.valC2 = 0;
 		BOT.IA.valC3 = 0;
 		BOT.IA.valC4 = 0;
 		 BOT.IA.CEJ1 = new ArrayList<Integer>(); //Liste des valeurs possible pour 1
 		 BOT.IA.CEJ2 = new ArrayList<Integer>(); //Liste des valeurs possible pour 2
 		 BOT.IA.CEJ3 = new ArrayList<Integer>(); //Liste des valeurs possible pour 3
 		 BOT.IA.CEJ4 = new ArrayList<Integer>(); //Liste des valeurs possible pour 4
 		 BOT.IA.CEJ1B = new ArrayList<Integer>(); //Liste des valeurs a ne plus choisir pour 1
 		 BOT.IA.CEJ2B = new ArrayList<Integer>(); //Liste des valeurs a ne plus choisir pour 2
 		 BOT.IA.CEJ3B = new ArrayList<Integer>(); //Liste des valeurs a ne plus choisir pour 3
 		 BOT.IA.CEJ4B = new ArrayList<Integer>();
 		Challenger.Valider.Tour = 0 ;
 		Duel.ProchainTour.p = 0 ;
		BOT.Comparateur.pp = 0 ;
		Reponses.pp = 0 ;
		IA.p = 0 ;
		BOT.ProchainTour.p = 0 ;
 		new Main() ;	
 		new Reponses();
 		Reponse1.Rep1 = r.nextInt(NbCouleur)+1;
 		Reponse2.Rep2 = r.nextInt(NbCouleur)+1;
 		Reponse3.Rep3 = r.nextInt(NbCouleur)+1;
 		Reponse4.Rep4 = r.nextInt(NbCouleur)+1;
 		
   
 	}
 	
}