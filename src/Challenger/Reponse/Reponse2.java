package Challenger.Reponse;


import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

import ListenerMENU.DomParser;

public class Reponse2 extends JPanel{
	static int NbCouleur = DomParser.NbCouleur  ;
	static Random r = new Random();
	public static int Rep2 = r.nextInt(NbCouleur) + 1;
	public static int cache = 0;
	public static JButton bouton = new JButton();
	private Color listclr[]= {Color.WHITE,Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA};
	
	public Reponse2(){
		if (DomParser.VoirRep == 1) {
		    System.out.println("R2 ="+Rep2);
		 }
		    this.add(bouton);
		    this.setBackground(Color.BLACK);
		    bouton.setBackground(listclr[cache]);
		    bouton.setPreferredSize(new Dimension(250, 250));
		    this.setVisible(true);
		   
		  }      

}