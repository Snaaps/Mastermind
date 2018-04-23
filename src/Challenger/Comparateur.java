package Challenger;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Challenger.Container.*;
import Challenger.Reponse.*;
import ListenerMENU.DomParser;
import Reload.Reload;
public class Comparateur {
	
	static int Correct = 0 ;
	 int B1 = Container1.B1 ;
	 int B2 = Container2.B2 ;
	 int B3 = Container3.B3 ;
	 int B4 = Container4.B4 ;
	 JOptionPane jop1 = new JOptionPane();
	 JButton buRep1 = Reponse1.bouton;
	 JButton buRep2 = Reponse2.bouton;
	 JButton buRep3 = Reponse3.bouton;
	 JButton buRep4 = Reponse4.bouton;
	 int NbCouleur = DomParser.NbCouleur  ;
	 int Rep1 = Reponse1.Rep1 ;
	 int Rep2 = Reponse2.Rep2 ;
	 int Rep3 = Reponse3.Rep3 ;
	 int Rep4 = Reponse4.Rep4 ;
	 
	 public Comparateur() {
		 if ( Valider.Tour < ListenerMENU.DomParser.NbTour) {
		 if (B1 == 0){
			 B1 = NbCouleur;
		 }
		 if (B2 == 0){
			 B2 = NbCouleur;
		 }
		 if (B3 == 0){
			 B3 = NbCouleur;
		 }
		 if (B4 == 0){
			 B4 = NbCouleur;
		 }
		 System.out.println("-------------------------------------------------------");
		 Comp1();
		 Comp2();
		 Comp3();
		 Comp4();
		 Correct();
		 if(Correct == 1) {
				
			  jop1.showMessageDialog(null, "VOUS AVEZ GAGNE(E) EN "+Valider.Tour+" Tour", "Information", JOptionPane.INFORMATION_MESSAGE);
			  new Reload() ;
			  Correct = 0 ;
		  }
		 
	 }
		 else {
			 jop1.showMessageDialog(null, "VOUS AVEZ PERDU(E)", "Information", JOptionPane.INFORMATION_MESSAGE);
			  new Reload() ;
		 }
	 }


	private void Comp1() {
		System.out.println("B1="+B1);
		if (B1 == Rep1) {
			System.out.println("B1 est correct");
			
			buRep1.setBackground(Color.GREEN);
		 }
		 else if(B1 == Rep2 || B1==Rep3 || B1 == Rep4) {
			 System.out.println("La couleur de B1 est mal placé");
			 buRep1.setBackground(Color.ORANGE);
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
			 buRep1.setBackground(Color.RED);
		 }
		
	}
	
	private void Comp2() {
		System.out.println("B2="+B2);
		if (B2 == Rep2) {
			System.out.println("B2 est correct");
			buRep2.setBackground(Color.GREEN);
		 }
		 else if(B2 == Rep1 || B2==Rep3 || B2==Rep4) {
			 System.out.println("La couleur de B2 est mal placé");
			 buRep2.setBackground(Color.ORANGE);
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
			 buRep2.setBackground(Color.RED);
		 }
	}
	private void Comp3() {
		System.out.println("B3="+B3);
		if (B3 == Rep3) {
			System.out.println("B3 est correct");
			buRep3.setBackground(Color.GREEN);
		 }
		 else if(B3 == Rep1 || B3==Rep2 || B3==Rep4) {
			 System.out.println("La couleur de B3 est mal placé");
			 buRep3.setBackground(Color.ORANGE);
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
			 buRep3.setBackground(Color.RED);
		 }
	}
	private void Comp4() {
		System.out.println("B4="+B4);
		if (B4 == Rep4) {
			System.out.println("B4 est correct");
			buRep4.setBackground(Color.GREEN);
		 }
		 else if(B4 == Rep1 || B4==Rep2 || B4==Rep3) {
			 System.out.println("La couleur de B4 est mal placé");
			 buRep4.setBackground(Color.ORANGE);
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
			 buRep4.setBackground(Color.RED);
		 }
	}
	private void Correct() {
		if(B1==Rep1 && B2==Rep2 && B3==Rep3 && B4==Rep4) {
			Correct = 1 ;
		}
		
	}
}
