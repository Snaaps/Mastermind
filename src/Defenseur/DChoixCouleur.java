package Defenseur;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Defenseur.DPanelJoueur;
import Defenseur.DPanelReponse;
import Defenseur.Valider;
import ListenerModJeu.ModJeu;
import Defenseur.DReponse1;
import Defenseur.DReponse2;
import Defenseur.DReponse3;
import Defenseur.DReponse4;

public class DChoixCouleur extends JFrame {
	public static JFrame ModJeu = 
			 ListenerModJeu.ModJeu.ModJeu;
	public static int B1 = DReponse1.DR1 ;
	public static int B2 = DReponse2.DR2 ;
	public static int B3 = DReponse3.DR3 ;
	public static int B4 = DReponse4.DR4 ;
	
	public static JFrame fen;

	private JPanel pan = new JPanel();
	
	private Valider val=new Valider();
	
	DPanelJoueur DPJ = new DPanelJoueur() ;
	
		public DChoixCouleur() {
			
			
				
				 fen = new JFrame() ;
			    fen.setTitle("MASTERMIND") ;
			    fen.setSize(1320,725);
			   fen.setLocationRelativeTo(null);
			   // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    fen.getContentPane().add(DPJ, BorderLayout.NORTH);
			   // this.setLayout(new GridLayout(4, 4 ,4 ,0));
			   
			    val.setLocation(125,400);
				   
			       pan.add(DPJ);

			       pan.add(val);
			   
			
			    fen.add(pan);
			    ModJeu.setVisible(false);
			    fen.setVisible(true); 
			    }
		

		
}
