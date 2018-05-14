package Reload ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import ListenerModJeu.ModJeu;
import Reload.* ;
public class ListenerQuit extends JPanel implements ActionListener {


JButton Quit = new JButton("Quitter");
		
	
	public  ListenerQuit() {
		this.add(Quit);
	   Quit.addActionListener( this);
	   Quit.setBackground(Color.WHITE);
	   Quit.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 		System.exit(1);	
   
 	}
 	
}