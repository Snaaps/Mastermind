package Defenseur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import ListenerMENU.DomParser;
public class DReponse4 extends JPanel implements ActionListener {
	
		public static int DR4 = 0 ;
		private String nom = this.getName();
		private JButton bouton = new JButton() ;
		int NbCouleur = DomParser.NbCouleur -1 ;
		Color TableauCouleur1[]={Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.YELLOW,Color.BLACK,Color.ORANGE,Color.PINK,Color.LIGHT_GRAY};
		
	  public DReponse4(){
		 
	    this.setName(nom);
	    
	 
	    this.add(bouton);
	    bouton.addActionListener(this);
	    bouton.setBackground(Color.WHITE);
	    bouton.setPreferredSize(new Dimension(300, 300));
	 
	    this.setVisible(true);
	   
	  }      
	  
	  
	  @Override
		 public void actionPerformed(ActionEvent arg0) {
		  DR4 = DR4 +1 ;
			 
		   
		    	if ( DR4 > NbCouleur ){
		    		 DR4 = 0 ;
		    	}
		    	bouton.setBackground(TableauCouleur1[DR4]); 
				
			    System.out.println("DR4="+DR4);
		    	Valider.Rep4 = DR4;
	}
	}

