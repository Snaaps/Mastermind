package ListenerModJeu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Duel.FenetreDuel;
import ListenerMENU.Main;
import Reponse.Reponses;

public class ListenerDuel extends JPanel implements ActionListener{
	public static JButton BDuel = new JButton("Duel");
	public static int ModDUEL = 0;
		public static JFrame Menu = Main.Menu ;
	
	public ListenerDuel() {
		this.add(BDuel);
	    BDuel.addActionListener(this);
	    BDuel.setBackground(Color.WHITE);
	    BDuel.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		ModDUEL = 1;
		new Reponses();
		Menu.setVisible(false);
	   new FenetreDuel() ;
		
	}
	

}
