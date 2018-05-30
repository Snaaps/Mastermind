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
import PlusMoin.PMChall;
import PlusMoin.Test;

public class ListenerPlusMoin extends JPanel implements ActionListener {
	
	JButton BPM = new JButton("Plus ou Moin");
		
	
	public  ListenerPlusMoin() {
		this.add(BPM);
		BPM.addActionListener(this);
		BPM.setBackground(Color.WHITE);
		BPM.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 		 new PMChall();
   
 	}
}