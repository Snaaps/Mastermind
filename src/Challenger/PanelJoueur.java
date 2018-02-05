package Challenger;
import java.awt.GridLayout;

import javax.swing.JPanel;

import Challenger.Container.Container1;
import Challenger.Container.Container2;
import Challenger.Container.Container3;
import Challenger.Container.Container4;

public class PanelJoueur extends JPanel{

	private Container1 A1 = new Container1();
	private Container2 A2 = new Container2();
	private Container3 A3 = new Container3();
	private Container4 A4 = new Container4();
	
	PanelJoueur(){
		 this.setLayout(new GridLayout(1, 4, 5, 5));
		this.add(A1);
		this.add(A2);
		this.add(A3);
		this.add(A4);
	}
	
}
