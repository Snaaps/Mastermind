package Challenger;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ListenerMENU.Main;
import ListenerModJeu.ModJeu;

public class ListenerMenu extends JPanel implements ActionListener {
	
	JButton Menu = new JButton("Menu");
		
	
	public  ListenerMenu() {
		this.add(Menu);
	    Menu.addActionListener(this);
	   Menu.setBackground(Color.WHITE);
	    Menu.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 		new ModJeu() ;	
   
 	}
}