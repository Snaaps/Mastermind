package Defenseur;
import java.awt.GridLayout;

import javax.swing.JPanel;



public class DPanelJoueur extends JPanel{

	DReponse1 DRep1 = new DReponse1(); 
	DReponse2 DRep2 = new DReponse2();
	DReponse3 DRep3 = new DReponse3() ;
	DReponse4 DRep4 = new DReponse4() ;
	
	DPanelJoueur(){
		 this.setLayout(new GridLayout(1, 4, 5, 5));
		this.add(DRep1);
		this.add(DRep2);
		this.add(DRep3);
		this.add(DRep4);
	}
	
}
