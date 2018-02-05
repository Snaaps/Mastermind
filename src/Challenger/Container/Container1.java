package Challenger.Container;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
 
public class Container1 extends JPanel implements ActionListener {
	public static int B1 = 0 ;
	private String nom = this.getName();
	private JButton bouton = new JButton() ;
	Color TableauCouleur1[]= {Color.WHITE,Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA};
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
	  B1 = B1 +1;
		 bouton.setBackground(TableauCouleur1[B1]); 
		 
	    System.out.println("B1="+B1);
	   
	    	if ( B1 >= 5 ){
	    	 B1 = 0 ;
	    	}
	    	 
}
}