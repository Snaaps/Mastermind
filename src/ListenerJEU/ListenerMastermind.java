package ListenerJEU;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Challenger.Fenetre;
import ListenerModJeu.ModJeu;

public class ListenerMastermind extends JPanel implements ActionListener {
	
	JButton BMastermind = new JButton("Mastermind");
		
	
	public  ListenerMastermind() {
		this.add(BMastermind);
		BMastermind.addActionListener(this);
		BMastermind.setBackground(Color.WHITE);
		BMastermind.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 		new ModJeu() ;
   
 	}
}