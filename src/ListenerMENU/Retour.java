package ListenerMENU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Retour extends JPanel implements ActionListener {
	private JButton Retour = new JButton();
	//
	public Retour() {
		this.add(Retour);
	Retour.setBounds(0,200,650,80);
	Retour.addActionListener(this);
	}
	
	
	
	public void actionPerformed(ActionEvent arg0) {
		new Cache();
		String i = OPTION.JTNbTour.getText(); 
	    int ii = Integer.parseInt(i);
	    ListenerMENU.DomParser.NbTour = ii ;
		
	}

	
}
