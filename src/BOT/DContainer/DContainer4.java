package BOT.DContainer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import BOT.IA;
public class DContainer4 extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom = this.getName();
	private JButton bouton = new JButton() ;
	Color TableauCouleur1[]= {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.YELLOW,Color.BLACK,Color.ORANGE,Color.PINK,Color.LIGHT_GRAY};
  public DContainer4(){
	 
    this.setName(nom);
    
 
    this.add(bouton);
    bouton.setBackground(Color.WHITE);
    bouton.setPreferredSize(new Dimension(300, 300));
    IACouleur();
    this.setVisible(true);
   
  }      
  
  
  public void IACouleur() {
	  
		 bouton.setBackground(TableauCouleur1[IA.valC4]); 
		 
	    System.out.println("B4="+IA.valC4);
	   
	    	
	    	 
}

}
