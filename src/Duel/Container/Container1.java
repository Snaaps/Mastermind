package Duel.Container;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
 import Duel.Comparateur ;
public class Container1 extends JPanel implements ActionListener {
	public static int B1 = 0 ;
	private String nom = this.getName();
	private JButton bouton = new JButton() ;
	Color TableauCouleur1[]= {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.RED};
  public Container1(){
	 
    this.setName(nom);
    
 
    this.add(bouton);
    bouton.addActionListener(this);
    bouton.setBackground(Color.WHITE);
    bouton.setPreferredSize(new Dimension(300, 300));
 
    this.setVisible(true);
   
  }      
  
  
  @Override
	 public void actionPerformed(ActionEvent arg0) {
	
		 bouton.setBackground(TableauCouleur1[B1]); 
		  B1 = B1 +1;
	    
	   
	    if ( B1 > 4 ){
	    	 B1 = 0 ;
	    	}
	    System.out.println("B1="+B1);
	    	Comparateur.B1 = B1 ;
}
  
}