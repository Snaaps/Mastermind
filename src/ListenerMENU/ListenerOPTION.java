package ListenerMENU;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ListenerOPTION extends JPanel implements ActionListener {
		
		JButton OPTION = new JButton("OPTION");
			
		
		public  ListenerOPTION() {
			this.add(OPTION);
			OPTION.addActionListener(this);
			OPTION.setBackground(Color.WHITE);
			OPTION.setPreferredSize(new Dimension(300, 100));
		 
		    this.setVisible(true);
			
		}
		
	 	public void actionPerformed(ActionEvent arg0) {
	 			new OPTION();
	   
	 	}
	}

