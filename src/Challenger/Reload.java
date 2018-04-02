package Challenger;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Reload extends JFrame {
	JPanel PanReload = new JPanel() ;
	ListenerReload Reload = new ListenerReload() ;
	ListenerMenu Menu = new ListenerMenu() ;

	public Reload() {
		this.setTitle("MASTERMIND") ;
	   this.setSize(1320,725);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    PanReload.add(Reload);
	    PanReload.add(Menu);
	    
	    this.add(PanReload);
	    
	    this.setVisible(true);
	}
}
