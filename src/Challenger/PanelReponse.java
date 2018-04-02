package Challenger;
import java.awt.GridLayout;

import javax.swing.JPanel;

import Challenger.Reponse.Reponse1;
import Challenger.Reponse.Reponse2;
import Challenger.Reponse.Reponse3;
import Challenger.Reponse.Reponse4;

public class PanelReponse extends JPanel{

	private Reponse1 Rep1 = new Reponse1();
	private Reponse2 Rep2 = new Reponse2();
	private Reponse3 Rep3 = new Reponse3();
	private Reponse4 Rep4 = new Reponse4();
	
	 PanelReponse(){
		 this.setLayout(new GridLayout(1, 4, 5, 5));
		this.add(Rep1);
		this.add(Rep2);
		this.add(Rep3);
		this.add(Rep4);
	}
	
}
