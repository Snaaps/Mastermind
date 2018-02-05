package Default;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import ListenerModJeu.ModJeu;

public class ListenerReload extends JPanel implements ActionListener{
	public static JButton Reload = new JButton() ;
	public  ListenerReload() {
		this.add(Reload);
	    Reload.addActionListener(this);
	    Reload.setBackground(Color.WHITE);
	    Reload.setPreferredSize(new Dimension(100, 100));
	 
	    this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent arg0) {
 		new ModJeu() ;
 		this.setVisible(false);	
   
 	}
}
