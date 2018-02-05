package Challenger;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame  {
	private JPanel pan2 = new JPanel() ;
	private JPanel pan1 = new JPanel();
	
	private Valider val=new Valider();
	private PanelJoueur PJ = new PanelJoueur() ;
	private PanelReponse PR= new PanelReponse() ;
	public Fenetre()  {
		
		JFrame fen = new JFrame() ;
	    this.setTitle("MASTERMIND") ;
	    this.setSize(1320,725);
	    this.setLocationRelativeTo(null);
	 //   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.getContentPane().add(PJ, BorderLayout.NORTH);
	   // this.setLayout(new GridLayout(4, 4 ,4 ,0));
	   
	    val.setLocation(125,400);
		   
	       pan1.add(PJ);
	       pan1.add(PR);
	       pan1.add(val);
	   
	
	    this.add(pan1);
	    
	    this.setVisible(true); 
	    }
	 
	
   

	
	
	}
   	 