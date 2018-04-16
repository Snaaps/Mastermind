package Duel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import BOT.Comparateur;
import BOT.IA;
import BOT.DContainer.*;
import Defenseur.DPanelReponse;
import Reponse.Reponses; 
import Duel.Container.Container1;
import Duel.Container.Container2;
import Duel.Container.Container3;
import Duel.Container.Container4;

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
 		Comparateur.pp = p ;
 		IA.p = p ;
 		
 		new Duel.Comparateur();
 		new IA();
 		
 		new Comparateur();
 		BOT.ProchainTour.Clic();
 		new PanelJoueur1();
 		//new PanelIA();
 		
   
 	}
}