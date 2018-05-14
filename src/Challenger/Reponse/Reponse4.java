package Challenger.Reponse;


import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

import ListenerMENU.DomParser;

public class Reponse4 extends JPanel{
	static int NbCouleur = DomParser.NbCouleur  ;
	static Random r = new Random();
	public static int Rep4 = r.nextInt(NbCouleur) +1;
	public static int cache = 0;
	public static JButton bouton = new JButton();
	private Color listclr[]= {Color.WHITE,Color.RED,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA};
	
	public Reponse4(){
		if (DomParser.VoirRep == 1) {
		    System.out.println("R4 ="+Rep4);
		 }
		    this.add(bouton);
		    this.setBackground(Color.BLACK);
		    bouton.setBackground(listclr[cache]);
		    bouton.setPreferredSize(new Dimension(250, 250));
		    this.setVisible(true);
		   
		  }      

}