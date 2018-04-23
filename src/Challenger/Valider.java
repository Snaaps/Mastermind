package Challenger;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class Valider extends JButton implements ActionListener {
	public static int Tour = 0 ;
	private String nom = this.getName();
	private JButton bouton = new JButton("VALIDER") ;
	int fin = Comparateur.Correct ;
	private JLabel valider = new JLabel("VALIDER");
	 
	public Valider(){
	 
   // this.setName("VALIDER");
    this.setSize(200, 50);
    //this.setLocation( 125,450);
 
    //this.add(bouton);
    this.addActionListener(this);
   
    this.add(valider);
    this.setVisible(true);
   
  }      
  
  
  @Override
	 public void actionPerformed(ActionEvent arg0) {
	  Tour++ ;
	  new Comparateur();
	  
	  
		
}
  
}