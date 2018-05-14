package Challenger;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Challenger.Container.Container1;
import Challenger.Container.Container2;
import Challenger.Container.Container3;
import Challenger.Container.Container4;
import Challenger.Container.panContainer;
import Challenger.Reponse.Reponse1;
import Challenger.Reponse.Reponse2;
import Challenger.Reponse.Reponse3;
import Challenger.Reponse.Reponse4;
import Challenger.Reponse.panReponse;
import ListenerMENU.Main;
import ListenerMENU.Main ;

public class Fenetre   {
	public static JFrame fenChal = new JFrame() ;
	private panReponse pan2 = new panReponse() ;
	private panContainer pan1 = new panContainer();
	private panValider pan3 = new panValider() ;

	
	public Fenetre()  {
		
	    fenChal.setTitle("MASTERMIND") ;
	    fenChal.setSize(1320,725);
	    fenChal.setLocationRelativeTo(null);
	   fenChal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	   // pan3.setBounds(0, 625, 1320, 100);
	     
	    // fenChal.getContentPane().add(pan1, BorderLayout.CENTER);
	     
	      // pan1.setBorder( new LineBorder(Color.BLACK));
	     //  pan2.setBorder( new LineBorder(Color.GREEN));
	     //  pan3.setBorder( new LineBorder(Color.RED));
	   
	    fenChal.add(pan1);
	   // fenChal.getContentPane().add(pan3, BorderLayout.SOUTH);
	    // fenChal.getContentPane().add(pan2, BorderLayout.NORTH);
	    fenChal.add(pan2);
	   
	    fenChal.add(pan3);

	    ListenerModJeu.ModJeu.ModJeu.setVisible(false);
	    fenChal.setVisible(true); 
	    }
	 
	}
   	 