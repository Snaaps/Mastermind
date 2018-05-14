package ListenerMENU;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ListenerModJeu.ModJeu;

public class ListenerJOUER extends JPanel implements ActionListener {
	
	JButton JOUER = new JButton("JOUER");
		
	
	public  ListenerJOUER() {
		this.add(JOUER);
	    JOUER.addActionListener(this);
	    JOUER.setBackground(Color.WHITE);
	    JOUER.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 		new ListenerJEU.Jeu() ;	
   
 	}
}