package Defenseur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
public class DReponse1 extends JPanel implements ActionListener {
	
		public static int DR1 = 0 ;
		private String nom = this.getName();
		private JButton bouton = new JButton() ;
		Color TableauCouleur1[]= {Color.WHITE,Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA};
		public static int a ;
	  public DReponse1(){
		 
	    this.setName(nom);
	    
	 
	    this.add(bouton);
	    bouton.addActionListener(this);
	    bouton.setBackground(Color.WHITE);
	    bouton.setPreferredSize(new Dimension(300, 300));
	 
	    this.setVisible(true);
	   
	  }      
	  
	  
	  @Override
		 public void actionPerformed(ActionEvent arg0) {
		  DR1 = DR1 +1 ;
			 bouton.setBackground(TableauCouleur1[DR1]); 
			
		    System.out.println("DR1="+DR1);
		   
		    	if ( DR1 >= 5 ){
		    		 DR1 = 0 ;
		    	}
		    	a = DR1 ;
	}
	}

