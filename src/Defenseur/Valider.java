package Defenseur;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Reponse.Reponses ;
public class Valider extends JPanel implements ActionListener {
	public static int Rep1 ;
	public static int Rep2 ;
	public static int Rep3 ;
	public static int Rep4 ;
	 private String nom = this.getName();
	private JButton bouton = new JButton("VALIDER") ;
	
	
   
      public Valider() {
    	  
    	  this.setName(nom);
    	    this.setSize(200, 200);
    	    this.setLocation( 125,450);
    	 
    	    this.add(bouton);
    	    bouton.addActionListener(this);
    	 
    	    this.setVisible(true);
      }
  
  
  @Override
	 public void actionPerformed(ActionEvent arg0) {
	   new Reponses() ;
	  	new FenetreJeu() ;
	  System.out.println("Rep ="+Rep1+","+Rep2+","+Rep3+","+Rep4);
	  DChoixCouleur.fen.dispose() ;
	//  new FenetreJeu() ;
		
}
  
}