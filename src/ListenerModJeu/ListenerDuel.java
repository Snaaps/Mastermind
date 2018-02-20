package ListenerModJeu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Duel.FenetreDuel;

public class ListenerDuel extends JPanel implements ActionListener{
	public static JButton BDuel = new JButton("Duel");
		
	
	public ListenerDuel() {
		this.add(BDuel);
	    BDuel.addActionListener(this);
	    BDuel.setBackground(Color.WHITE);
	    BDuel.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
	   new FenetreDuel() ;
		
	}
	

}
