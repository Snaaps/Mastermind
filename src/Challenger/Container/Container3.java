package Challenger.Container;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import ListenerMENU.DomParser ;
public class Container3 extends JPanel implements ActionListener {
	public static int B3 = 0 ;
	private String nom = this.getName();
	private JButton bouton = new JButton() ;
	int NbCouleur = DomParser.NbCouleur -1 ;
	Color TableauCouleur1[]=  {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.YELLOW,Color.BLACK,Color.ORANGE,Color.PINK,Color.LIGHT_GRAY};
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
		 bouton.setBackground(TableauCouleur1[B3]); 
		B3 = B3 +1 ;
	    System.out.println("B3="+B3);
	   
	    	if ( B3 > NbCouleur ){
	    		 B3 = 0 ;
	    	}
}
}