package BOT;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import BOT.DContainer.DContainer1;
import BOT.DContainer.DContainer2;
import BOT.DContainer.DContainer3;
import BOT.DContainer.DContainer4;


public class ProchainTour extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int p = 0 ;
	/*static DContainer1 IABu1 = IA.IABu1;
	 static DContainer2 IABu2 = IA.IABu2;
	 static DContainer3 IABu3 = IA.IABu3;
	 static DContainer4 IABu4 = IA.IABu4;*/
	JButton PT = new JButton("Prochain Tour");
	
	public  ProchainTour() {
		this.add(PT);
	    PT.addActionListener(this);
	    PT.setBackground(Color.WHITE);
	    PT.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
 	public void actionPerformed(ActionEvent arg0) {
 		p++ ;
 		new IA() ;	
 		IA.IABu1.IACouleur(); 
		IA.IABu2.IACouleur(); 
		IA.IABu3.IACouleur(); 
		IA.IABu4.IACouleur();
   
 	}
}