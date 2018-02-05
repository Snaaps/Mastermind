package Challenger;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class Valider extends JPanel implements ActionListener {
	private String nom = this.getName();
	private JButton bouton = new JButton("VALIDER") ;
	int fin = Comparateur.Correct ;
	 
	public Valider(){
	 
    this.setName(nom);
    this.setSize(200, 200);
    this.setLocation( 125,450);
 
    this.add(bouton);
    bouton.addActionListener(this);
 
    this.setVisible(true);
   
  }      
  
  
  @Override
	 public void actionPerformed(ActionEvent arg0) {
	  new Comparateur();
	  
		
}
  
}