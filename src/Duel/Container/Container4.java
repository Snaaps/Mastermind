package Duel.Container;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Duel.Comparateur;
 
public class Container4 extends JPanel implements ActionListener {
	public static int B4 = 0 ;
	private String nom = this.getName();
	private JButton bouton = new JButton() ;
	Color TableauCouleur1[]= {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.RED};
  public Container4(){
	 
    this.setName(nom);
    
 
    this.add(bouton);
    bouton.addActionListener(this);
    bouton.setBackground(Color.WHITE);
    bouton.setPreferredSize(new Dimension(300, 300));
 
    this.setVisible(true);
   
  }      
  
  
  @Override
	 public void actionPerformed(ActionEvent arg0) {
		
		B4 = B4 +1 ;
		 bouton.setBackground(TableauCouleur1[B4]); 
	   
	    	if ( B4 > 4 ){
	    		 B4 = 0 ;
	    	}
	    	  System.out.println("B4="+B4);
	    	Comparateur.B4 = B4 ;
}
}