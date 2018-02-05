package ListenerMENU;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListenerQUITTER extends JPanel implements ActionListener {
	JButton QUITTER = new JButton("QUITTER");
		JFrame Menu = Main.Menu ;
	
	public  ListenerQUITTER() {
		this.add(QUITTER);
	    QUITTER.addActionListener(this);
	    QUITTER.setBackground(Color.WHITE);
	    QUITTER.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 	//	Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
   
 	}
}
