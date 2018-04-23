package Challenger.Reponse;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Challenger.Container.*;

public class panReponse extends JPanel {

	private Container1 Rep1 = new Container1();
	private Container2 Rep2 = new Container2();
	private Container3 Rep3 = new Container3();
	private Container4 Rep4 = new Container4();
	
	public panReponse()
	{
		    this.setBounds(0, 10, 1310, 300);
		    this.setBackground(Color.white);
		   // this.setLayout(new GridLayout(1, 4, 50, 50));
		    
			this.add(Rep1);
			this.add(Rep2);
			this.add(Rep3);
			this.add(Rep4);
	}
}
