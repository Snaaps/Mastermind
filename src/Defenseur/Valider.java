package Defenseur;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Valider extends JPanel implements ActionListener {
	int DR1 = DReponse1.a;
	int DR2 = DReponse2.b ;
	int DR3 = DReponse3.c ;
	int DR4 = DReponse4.d ;
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
	 
	  System.out.println("DR ="+DR1+","+DR2+","+DR3+","+DR4);
	  DChoixCouleur.fen.dispose() ;
	//  new FenetreJeu() ;
		
}
  
}