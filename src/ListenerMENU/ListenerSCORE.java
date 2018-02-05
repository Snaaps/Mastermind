package ListenerMENU;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Default.Fenetre;

public class ListenerSCORE extends JPanel implements ActionListener {
	JButton SCORE = new JButton("SCORE");
		
	
	public  ListenerSCORE() {
		this.add(SCORE);
	    SCORE.addActionListener(this);
	    SCORE.setBackground(Color.WHITE);
	    SCORE.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 		
   
 	}
}
