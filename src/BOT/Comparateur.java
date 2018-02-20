package BOT;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import BOT.DContainer.DContainer1;
import BOT.DContainer.DContainer2;
import BOT.DContainer.DContainer3;
import BOT.DContainer.DContainer4;
import Duel.Reponse.*;

public class Comparateur {
	static int Correct = 0 ;
	 int B1 = IA.valC1 ;
	 int B2 = IA.valC2 ;
	 int B3 = IA.valC3 ;
	 int B4 = IA.valC4 ;
	 JOptionPane jop1 = new JOptionPane();
	 
	 public static int RBot1 = 0 ;
	 public static int RBot2 = 0 ;
	 public static int RBot3 = 0 ;
	 public static int RBot4 = 0 ;
	 
	 int Rep1 = Reponse1.Rep1 ;
	 int Rep2 = Reponse2.Rep2 ;
	 int Rep3 = Reponse3.Rep3 ;
	 int Rep4 = Reponse4.Rep4 ;
	 
	 public Comparateur() {
		 if (B1 == 0){
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
		 }
		 System.out.println("-------------------------------------------------------");
		 Comp1();
		 Comp2();
		 Comp3();
		 Comp4();
		 Correct();
		 if(Correct == 1) {
				
			  jop1.showMessageDialog(null, "LE BOT GAGNE", "Information", JOptionPane.INFORMATION_MESSAGE);
			  
		  }
		 
	 }


	private void Comp1() {
		System.out.println("B1="+B1);
		if (B1 == Rep1) {
			 RBot1 = 1 ; //Variable indiquant que le bot a juste
			
		 }
		 else if(B1 == Rep2 || B1==Rep3 || B1 == Rep4) {
			RBot1 = 2 ; // Variable indiquant que le bot se trompe d'endroit
		 }
		
			
		
		 else {
			RBot1 = 3 ; //Variable indiquant au bot que la couleur n'est pas en jeu
		 }
		
	}
	
	private void Comp2() {
		System.out.println("B2="+B2);
		if (B2 == Rep2) {
			RBot2 = 1 ; //Variable indiquant que le bot a juste
		 }
		 else if(B2 == Rep1 || B2==Rep3 || B2==Rep4) {
			 RBot2 = 2 ; // Variable indiquant que le bot se trompe d'endroit
		 }

		 else {
			 RBot2 = 3 ; //Variable indiquant au bot que la couleur n'est pas en jeu
		 }
	}
	private void Comp3() {
		System.out.println("B3="+B3);
		if (B3 == Rep3) {
			RBot3 = 1 ; //Variable indiquant que le bot a juste
		 }
		 else if(B3 == Rep1 || B3==Rep2 || B3==Rep4) {
			 RBot3 = 2 ; // Variable indiquant que le bot se trompe d'endroit
		 }
		
		 else {
			 RBot3 = 3 ; //Variable indiquant au bot que la couleur n'est pas en jeu
		 }
	}
	private void Comp4() {
		System.out.println("B4="+B4);
		if (B4 == Rep4) {
			RBot4 = 1 ; //Variable indiquant que le bot a juste
		 }
		 else if(B4 == Rep1 || B4==Rep2 || B4==Rep3) {
			 RBot4 = 2 ; // Variable indiquant que le bot se trompe d'endroit
		 }
	
		 else {
			 RBot4 = 3 ; //Variable indiquant au bot que la couleur n'est pas en jeu
		 }
	}
	private void Correct() {
		if(B1==Rep1 && B2==Rep2 && B3==Rep3 && B4==Rep4) {
			Correct = 1 ;
		}
		
	}
}
