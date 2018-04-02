package BOT.DContainer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import BOT.IA;
public class DContainer1 extends JPanel {
	
	private String nom = this.getName();
	private JButton bouton = new JButton() ;
	Color TableauCouleur1[]= {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.RED};
  public DContainer1(){
	 
    this.setName(nom);
    
 
    this.add(bouton);
    bouton.setBackground(Color.WHITE);
    bouton.setPreferredSize(new Dimension(300, 300));
    IACouleur();
    this.setVisible(true);
   
  }      
  
  
  public void IACouleur() {
	  
		 bouton.setBackground(TableauCouleur1[IA.valC1]); 
		 
	    System.out.println("B1="+IA.valC1);
	   
	    	
	    	 
}

}
