package Duel.Container;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Duel.Comparateur;
import ListenerMENU.DomParser;
 
public class Container2 extends JPanel implements ActionListener {
	public static int B2 = 0 ;
	private String nom = this.getName();
	private JButton bouton = new JButton() ;
	Color TableauCouleur1[]= {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.YELLOW,Color.BLACK,Color.ORANGE,Color.PINK,Color.LIGHT_GRAY};
  public Container2(){
	 
    this.setName(nom);
    
 
    this.add(bouton);
    bouton.addActionListener(this);
    bouton.setBackground(Color.WHITE);
    bouton.setPreferredSize(new Dimension(300, 300));
 
    this.setVisible(true);
   
  }      
  
  
  @Override
	 public void actionPerformed(ActionEvent arg0) {
		 
		B2 = B2 +1 ;
		// bouton.setBackground(TableauCouleur1[B2]);
	    if ( B2 > DomParser.NbCouleur ){
	    		 B2 = 0 ;
	    	}
	    bouton.setBackground(TableauCouleur1[B2]);
	    System.out.println("B2="+B2);
	    	Comparateur.B2 = B2 ;
}
}