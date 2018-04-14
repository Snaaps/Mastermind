package BOT;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import BOT.DContainer.DContainer1;
import BOT.DContainer.DContainer2;
import BOT.DContainer.DContainer3;
import BOT.DContainer.DContainer4;
import Reponse.Reponses; 
import BOT.ProchainTour;
public class Comparateur {
	static int Correct = 0 ;
		public static int pp = Reponses.pp ;
	 int B1 = IA.valC1 ;
	 int B2 = IA.valC2 ;
	 int B3 = IA.valC3 ;
	 int B4 = IA.valC4 ;
	 JOptionPane jop1 = new JOptionPane();
	 
	 public static int RBot1 = 0 ;
	 public static int RBot2 = 0 ;
	 public static int RBot3 = 0 ;
	 public static int RBot4 = 0 ;
	 
	 public static int Rep1 ; //= Reponse.Reponses.Rep1  ;
	 public static int Rep2; // = Reponse.Reponses.Rep2  ;
	 public static int Rep3; // = Reponse.Reponses.Rep3   ;
	 public static int Rep4; // = Reponse.Reponses.Rep4  ;
	 
	 public Comparateur() {
		/* if (B1 == 0){
			 B1 = 5;
		 }
		 if (B2 == 0){
			 B2 = 5;
		 }
		 if (B3 == 0){
			 B3 = 5;
		 }
		 if (B4 == 0){
			 B4 = 5;
		 } */
		//d System.out.println("-------------------------------------------------------");
		 
		 Comp1();
		 Comp2();
		 Comp3();
		 Comp4();
		 Correct();
		 if(Correct == 1) {
				
			  JOptionPane.showMessageDialog(null, "LE BOT GAGNE EN "+pp+" TOURS", "Information", JOptionPane.INFORMATION_MESSAGE);
			  
		  }
		 
	 }


	private void Comp1() {
		
		if (B1 == Rep1) {
			 RBot1 = 1 ; //Variable indiquant que le bot a juste
			// System.out.println("RBot1 ="+RBot1);
			
		 }
		 else if(B1 == Rep2 || B1==Rep3 || B1 == Rep4) {
			RBot1 = 2 ; // Variable indiquant que le bot se trompe d'endroit
			// System.out.println("RBot1 ="+RBot1);
		 }
		
			
		
		 else {
			RBot1 = 3 ; //Variable indiquant au bot que la couleur n'est pas en jeu
			// System.out.println("RBot1 ="+RBot1);
		 }
		
	}
	
	private void Comp2() {
		
		if (B2 == Rep2) {
			RBot2 = 1 ; //Variable indiquant que le bot a juste
			// System.out.println("RBot2 ="+RBot2);
		 }
		 else if(B2 == Rep1 || B2==Rep3 || B2==Rep4) {
			 RBot2 = 2 ; // Variable indiquant que le bot se trompe d'endroit
			 //System.out.println("RBot2 ="+RBot2);
		 }

		 else {
			 RBot2 = 3 ; //Variable indiquant au bot que la couleur n'est pas en jeu
			// System.out.println("RBot2 ="+RBot2);
		 }
	}
	private void Comp3() {
		
		if (B3 == Rep3) {
			RBot3 = 1 ; //Variable indiquant que le bot a juste
			//System.out.println("RBot3 ="+RBot3);
		 }
		 else if(B3 == Rep1 || B3==Rep2 || B3==Rep4) {
			 RBot3 = 2 ; // Variable indiquant que le bot se trompe d'endroit
			// System.out.println("RBot3 ="+RBot3);
		 }
		
		 else {
			 RBot3 = 3 ; //Variable indiquant au bot que la couleur n'est pas en jeu
			// System.out.println("RBot3 ="+RBot3);
		 }
	}
	private void Comp4() {
		
		if (B4 == Rep4) {
			RBot4 = 1 ; //Variable indiquant que le bot a juste
			// System.out.println("RBot4 ="+RBot4);
		 }
		 else if(B4 == Rep1 || B4==Rep2 || B4==Rep3) {
			 RBot4 = 2 ; // Variable indiquant que le bot se trompe d'endroit
			// System.out.println("RBot4 ="+RBot4);
		 }
	
		 else {
			 RBot4 = 3 ; //Variable indiquant au bot que la couleur n'est pas en jeu
			 // System.out.println("RBot4 ="+RBot4);
		 }
	}
	private void Correct() {
		if(B1==Rep1 && B2==Rep2 && B3==Rep3 && B4==Rep4) {
			Correct = 1 ;
		}
		
	}
}
