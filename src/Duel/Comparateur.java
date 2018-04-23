package Duel;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Duel.Reponse.Reponse1;
import Duel.Reponse.Reponse2;
import Duel.Reponse.Reponse3;
import Duel.Reponse.Reponse4;
import ListenerModJeu.ListenerDefenseur;
import Reload.Reload;
import Reponse.Reponses;
import Duel.PanelJoueur1;
import Duel.Container.*;
import Duel.Reponse.*;
public class Comparateur {
	
	static int Correct = 0 ;
	 public static int B1 = Container1.B1;
	 public static int B2 = Container2.B2 ;
	 public static int B3 = Container3.B3 ;
	 public static int B4 = Container4.B4 ;
	 JOptionPane jop1 = new JOptionPane();
	 JButton buRep1 = Reponse1.bouton;
	 JButton buRep2 = Reponse2.bouton;
	 JButton buRep3 = Reponse3.bouton;
	 JButton buRep4 = Reponse4.bouton;
	 int Rep1 = Reponses.Rep1 ;
	 int Rep2 = Reponses.Rep2 ;
	 int Rep3 = Reponses.Rep3 ;
	 int Rep4 = Reponses.Rep4 ;
	 public static int C1 = 0;
	public static int C2 = 0;
	public static int C3 = 0;
	public static int C4 = 0;
	 
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
		 }*/
		 System.out.println("-------------------------------------------------------");
		 System.out.println("Reponse = "+Reponses.Rep1+Reponses.Rep2+Reponses.Rep3+Reponses.Rep4);
		 Comp1();
		 Comp2();
		 Comp3();
		 Comp4();
		 Correct();
		 if(Correct == 1) {
				
			  jop1.showMessageDialog(null, "VOUS AVEZ GAGNE(E)", "Information", JOptionPane.INFORMATION_MESSAGE);
			  new Reload();
			  Correct = 0 ;
			  
		  }
		 
	 }


	private void Comp1() {
		System.out.println("B1="+B1);
		if (B1 == Rep1) {
			System.out.println("B1 est correct");
			C1 = 1;
			Reponse1.bouton.setBackground(Color.GREEN);
		 }
		 else if(B1 == Rep2 || B1==Rep3 || B1 == Rep4) {
			 System.out.println("La couleur de B1 est mal placé");
			 C1 = 2 ;
			 Reponse1.bouton.setBackground(Color.ORANGE);
		 }
		/* else if (B1==Rep3) {
			 System.out.println("La couleur de B1 est mal placé");
			 buRep1.setBackground(Color.ORANGE);
			 
		 }
		 else if (B1 == Rep4) {
			 System.out.println("La couleur de B1 est mal placé");
			 buRep1.setBackground(Color.ORANGE); */
			
		
		 else {
			 System.out.println("La couleur de B1 n'est pas en en jeu");
			 Reponse1.bouton.setBackground(Color.RED);
			 C1 = 0;
		 }
		
	}
	
	private void Comp2() {
		System.out.println("B2="+B2);
		if (B2 == Rep2) {
			System.out.println("B2 est correct");
			C2 = 1 ;
			Reponse2.bouton.setBackground(Color.GREEN);
		 }
		 else if(B2 == Rep1 || B2==Rep3 || B2==Rep4) {
			 System.out.println("La couleur de B2 est mal placé");
			 C2 = 2 ;
			 Reponse2.bouton.setBackground(Color.ORANGE);
		 }
	/*	 else if (B2==Rep3) {
			 System.out.println("La couleur de B2 est mal placé");
			 buRep2.setBackground(Color.ORANGE);
		 }
		 else if (B2 == Rep4) {
			 System.out.println("La couleur de B2 est mal placé");
			 buRep2.setBackground(Color.ORANGE);
		 } */
		 else {
			 System.out.println("La couleur de B2 n'est pas en en jeu");
			 C2 = 0;
			 Reponse2.bouton.setBackground(Color.RED);
		 }
	}
	private void Comp3() {
		System.out.println("B3="+B3);
		if (B3 == Rep3) {
			System.out.println("B3 est correct");
			C3 = 1;
			Reponse3.bouton.setBackground(Color.GREEN);
		 }
		 else if(B3 == Rep1 || B3==Rep2 || B3==Rep4) {
			 System.out.println("La couleur de B3 est mal placé");
			 C3 = 2;
			 Reponse3.bouton.setBackground(Color.ORANGE);
		 }
		/* else if (B3==Rep2) {
			 System.out.println("La couleur de B3 est mal placé");
			 buRep3.setBackground(Color.ORANGE);
		 }
		 else if (B3 == Rep4) {
			 System.out.println("La couleur de B3 est mal placé");
			 buRep3.setBackground(Color.ORANGE); 
		 } */
		 else {
			 System.out.println("La couleur de B3 n'est pas en en jeu");
			 C3=0;
			 Reponse3.bouton.setBackground(Color.RED);
		 }
	}
	private void Comp4() {
		System.out.println("B4="+B4);
		if (B4 == Rep4) {
			System.out.println("B4 est correct");
			C4=1;
			Reponse4.bouton.setBackground(Color.GREEN);
		 }
		 else if(B4 == Rep1 || B4==Rep2 || B4==Rep3) {
			 System.out.println("La couleur de B4 est mal placé");
			 C4=2;
			 Reponse4.bouton.setBackground(Color.ORANGE);
		 }
		/* else if (B4==Rep2) {
			 System.out.println("La couleur de B4 est mal placé");
			 buRep4.setBackground(Color.ORANGE);
		 }
		 else if (B4 == Rep3) {
			 System.out.println("La couleur de B4 est mal placé");
			 buRep4.setBackground(Color.ORANGE);
		 } */
		 else {
			 System.out.println("La couleur de B4 n'est pas en en jeu");
			 C4=0; 
			 Reponse4.bouton.setBackground(Color.RED);
		 }
	}
	private void Correct() {
		if(B1==Rep1 && B2==Rep2 && B3==Rep3 && B4==Rep4) {
			Correct = 1 ;
		}
		
	}
}
