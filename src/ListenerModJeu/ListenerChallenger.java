package ListenerModJeu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Challenger.Fenetre;
import ListenerModJeu.ModJeu;

public class ListenerChallenger extends JPanel implements ActionListener {
	
	JButton BChallenger = new JButton("Challenger");
		
	
	public  ListenerChallenger() {
		this.add(BChallenger);
	    BChallenger.addActionListener(this);
	    BChallenger.setBackground(Color.WHITE);
	    BChallenger.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 		new Fenetre() ;
   
 	}
}