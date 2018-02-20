package ListenerModJeu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class ModJeu extends JFrame{
	private JPanel PanMJ = new JPanel() ;
	static ListenerChallenger Challenger = new ListenerChallenger();
	static ListenerDefenseur Defenseur = new ListenerDefenseur();
	static ListenerDuel Duel = new ListenerDuel();
	
	public static JFrame ModJeu = new JFrame() ;
	
	public ModJeu() {
		
		
	 	ModJeu.setTitle("MASTERMIND") ;
	    ModJeu.setSize(1320,725);
	    ModJeu.setLocationRelativeTo(null);
	  //  ModJeu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    PanMJ.add(Challenger);
	    PanMJ.add(Defenseur);
	    PanMJ.add(Duel); 
	    
	    ModJeu.add(PanMJ);
	    
	    ModJeu.setVisible(true);
	}


	
}