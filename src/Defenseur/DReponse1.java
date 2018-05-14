package Defenseur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Defenseur.Valider;
import ListenerMENU.DomParser;

import javax.swing.JButton;
import javax.swing.JPanel;
public class DReponse1 extends JPanel implements ActionListener {
	
		public static int DR1 ;
		private String nom = this.getName();
		private JButton bouton = new JButton() ;
		int NbCouleur = DomParser.NbCouleur -1 ;
		Color TableauCouleur1[]= {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.YELLOW,Color.BLACK,Color.ORANGE,Color.PINK,Color.LIGHT_GRAY};
		public static int a ;
	  public DReponse1(){
		 DR1 = 0 ;
	    this.setName(nom);
	    
	 
	    this.add(bouton);
	    bouton.addActionListener(this);
	    bouton.setBackground(Color.WHITE);
	    bouton.setPreferredSize(new Dimension(300, 300));
	 
	    this.setVisible(true);
	   
	  }      
	  
	  
	  
		 public void actionPerformed(ActionEvent arg0) {
		  DR1 = DR1 +1 ;
			
			
		    
		   
		    	if ( DR1 > NbCouleur ){
		    		 DR1 = 0 ;
		    	}
		    	System.out.println("DR1="+DR1);
		    	 bouton.setBackground(TableauCouleur1[DR1]); 
		   Valider.Rep1 = DR1 ;
	}
	}

