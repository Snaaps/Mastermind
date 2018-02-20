package BOT.DContainer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import BOT.IA;
public class DContainer4 extends JPanel implements ActionListener {
	public static int B4 = IA.valC4 ;
	private String nom = this.getName();
	private JButton bouton = new JButton() ;
	Color TableauCouleur1[]= {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA};
  public DContainer4(){
	 
    this.setName(nom);
    
 
    this.add(bouton);
    bouton.addActionListener(this);
    bouton.setBackground(Color.WHITE);
    bouton.setPreferredSize(new Dimension(300, 300));
 
    this.setVisible(true);
   
  }      
  
  
  @Override
	 public void actionPerformed(ActionEvent arg0) {
	  B4 = B4 +1 ;
		 bouton.setBackground(TableauCouleur1[B4]); 
		
	    System.out.println("B4="+B4);
	   
	    	if ( B4 >= 5 ){
	    		 B4 = 0 ;
	    	}
}
}