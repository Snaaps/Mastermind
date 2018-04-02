package Duel.Reponse;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Reponse4 extends JPanel{
	
	public static int cache = 0;
	public static JButton bouton = new JButton();
	private Color listclr[]=  {Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.RED};
	
	public Reponse4(){
		 
		    this.add(bouton);
		    bouton.setBackground(listclr[cache]);
		    bouton.setPreferredSize(new Dimension(300, 300));
		    this.setVisible(true);
		   
		  }      

}