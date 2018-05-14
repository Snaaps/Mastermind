package ListenerJEU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ListenerMENU.Main;
 


public class Jeu extends JFrame{
	public static JFrame Menu = Main.Menu ;
	private JPanel PanJ = new JPanel() ;
	static ListenerMastermind Mastermind = new ListenerMastermind();
	static ListenerPlusMoin PlusMoin = new ListenerPlusMoin();
	
	
	public static JFrame ModJeu = new JFrame() ;
	
	public Jeu() {
		
		
	 	ModJeu.setTitle("MASTERMIND") ;
	    ModJeu.setSize(1000,180);
	    ModJeu.setLocationRelativeTo(null);
	    ModJeu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    PanJ.add(Mastermind);
	    PanJ.add(PlusMoin);
	     
	    
	    ModJeu.add(PanJ);
	    
	    Menu.setVisible(false);
	    ModJeu.setVisible(true);
	}


	
}
