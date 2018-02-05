package Defenseur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
public class DReponse2 extends JPanel implements ActionListener {
	
		public static int DR2 = 0 ;
		private String nom = this.getName();
		private JButton bouton = new JButton() ;
		Color TableauCouleur1[]= {Color.WHITE,Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA};
		public static int b ;
	  public DReponse2(){
		 
	    this.setName(nom);
	    
	 
	    this.add(bouton);
	    bouton.addActionListener(this);
	    bouton.setBackground(Color.WHITE);
	    bouton.setPreferredSize(new Dimension(300, 300));
	 
	    this.setVisible(true);
	   
	  }      
	  
	  
	  @Override
		 public void actionPerformed(ActionEvent arg0) {
		  DR2 = DR2 +1 ;
			 bouton.setBackground(TableauCouleur1[DR2]); 
			
		    System.out.println("DR2="+DR2);
		   
		    	if ( DR2 >= 5 ){
		    		 DR2 = 0 ;
		    	}
		    	
		     b = DR2 ;
	}
	}

