package Defenseur;
import java.awt.GridLayout;

import javax.swing.JPanel;



public class DPanelReponse extends JPanel{

	private DReponse1 Rep1 = new DReponse1();
	private DReponse2 Rep2 = new DReponse2();
	private DReponse3 Rep3 = new DReponse3();
	private DReponse4 Rep4 = new DReponse4();
	
	 public DPanelReponse(){
		 this.setLayout(new GridLayout(1, 1, 3, 0));
		this.add(Rep1);
		this.add(Rep2);
		this.add(Rep3);
		this.add(Rep4);
	}
	
}
