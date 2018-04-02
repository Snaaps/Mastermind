package Defenseur;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import BOT.IA;
import BOT.ProchainTour;
import BOT.DContainer.*;


public class FenetreJeu extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int Rep1 = 0 ;
	public static int Rep2 = 0 ;
	public static int Rep3 = 0 ;
	public static int Rep4 = 0 ;
	 public static JFrame Menu = new JFrame() ;
	 private JPanel PanMENU = new JPanel() ;
	 private JPanel PanValider = new JPanel();
	 static DContainer1 IABu1 = IA.IABu1;
	 static DContainer2 IABu2 = IA.IABu2;
	 static DContainer3 IABu3 = IA.IABu3;
	 static DContainer4 IABu4 = IA.IABu4;
	 static ProchainTour PT = new ProchainTour();
	public FenetreJeu() {
	 Menu.setTitle("MASTERMIND") ;
     Menu.setSize(1320,725);
     Menu.setLocationRelativeTo(null);
     Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     PanMENU.add(IABu1);
     PanMENU.add(IABu2);
     PanMENU.add(IABu3);
     PanMENU.add(IABu4);
     PanValider.add(PT);
     Menu.add(PanMENU,BorderLayout.NORTH);
     Menu.add(PanValider, BorderLayout.SOUTH);
     Menu.setVisible(true);
     
	}
	
	
}