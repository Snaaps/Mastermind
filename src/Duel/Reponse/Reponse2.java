package Duel.Reponse;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Reponse2 extends JPanel{
	
	static Random r = new Random();
	public static int Rep2 = r.nextInt(5) + 1;
	public static int cache = 0;
	public static JButton bouton = new JButton();
	private Color listclr[]= {Color.WHITE,Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA};
	
	public Reponse2(){
		 
		System.out.println("R2 ="+Rep2);
		 
		    this.add(bouton);
		    bouton.setBackground(listclr[cache]);
		    bouton.setPreferredSize(new Dimension(300, 300));
		    this.setVisible(true);
		   
		  }      

}