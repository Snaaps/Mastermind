package ListenerModJeu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Defenseur.DChoixCouleur;

public class ListenerDefenseur extends JPanel implements ActionListener{
	public static JButton BDefenseur = new JButton("Defenseur");
		public static int ModDEF = 0;
	
	public ListenerDefenseur() {
		this.add(BDefenseur);
	    BDefenseur.addActionListener(this);
	    BDefenseur.setBackground(Color.WHITE);
	    BDefenseur.setPreferredSize(new Dimension(300, 100));
	 
	    this.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		ModDEF = 1;
	  new DChoixCouleur() ;
		
	}
	

}
