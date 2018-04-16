package Duel.Container;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Duel.Comparateur;
import ListenerMENU.DomParser;
 
public class Container3 extends JPanel implements ActionListener {
	public static int B3 = 0 ;
	private String nom = this.getName();
	private JButton bouton = new JButton() ;
	Color TableauCouleur1[]= {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.YELLOW,Color.BLACK,Color.ORANGE,Color.PINK,Color.LIGHT_GRAY};
  public Container3(){
	 
    this.setName(nom);
    
 
    this.add(bouton);
    bouton.addActionListener(this);
    bouton.setBackground(Color.WHITE);
    bouton.setPreferredSize(new Dimension(300, 300));
 
    this.setVisible(true);
   
  }      
  
  
  @Override
	 public void actionPerformed(ActionEvent arg0) {
		 
		B3 = B3 +1 ;

	   
	    if ( B3 > DomParser.NbCouleur ){
	    		 B3 = 0 ;
	    	}
		bouton.setBackground(TableauCouleur1[B3]); 
	    System.out.println("B3="+B3);
	    	Comparateur.B3 = B3 ;
}
}