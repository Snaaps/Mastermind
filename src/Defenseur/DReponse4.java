package Defenseur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
public class DReponse4 extends JPanel implements ActionListener {
	
		public static int DR4 = 0 ;
		private String nom = this.getName();
		private JButton bouton = new JButton() ;
		Color TableauCouleur1[]= {Color.WHITE,Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA};
		public static int d ;
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
			 bouton.setBackground(TableauCouleur1[DR4]); 
			DR4 = DR4 +1 ;
		    System.out.println("DR4="+DR4);
		   
		    	if ( DR4 >= 5 ){
		    		 DR4 = 0 ;
		    	}
		    	 d = DR4 ;
	}
	}

