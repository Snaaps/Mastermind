package Reload;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Challenger.Fenetre;
import Defenseur.DChoixCouleur;
import Defenseur.FenetreJeu;
import Duel.FenetreDuel;
import Reponse.Reponses;
import Duel.FenetreDuel; ;
public class Reload extends JFrame {
	 public static JFrame Reload = new JFrame() ;
	 private ListenerRMenu RMenu = new ListenerRMenu() ;
	 private ListenerQuit Quit = new ListenerQuit();
	 private JPanel Pan = new JPanel() ;
	 JFrame fenDuel = FenetreDuel.fenDuel ;
	 JFrame Menu = FenetreJeu.Menu ;
	 JFrame fenChal = Fenetre.fenChal ;
	 JFrame fenCC = DChoixCouleur.fen ;
	public Reload() {
		
		Reload.setTitle("MASTERMIND") ;
	    Reload.setSize(700,300);
	    Reload.setLocationRelativeTo(null);
	    Reload.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Pan.add(RMenu);
	    Pan.add(Quit); 
	    Reload.add(Pan) ;
	    fenDuel.setVisible(false);
	    Menu.setVisible(false);
	    fenChal.setVisible(false);
	    Reload.setVisible(true);
		
	}
}
