package Defenseur;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Challenger.Container.Container1;
import Challenger.Container.Container2;
import Challenger.Container.Container3;
import Challenger.Container.Container4;
import Challenger.Reponse.Reponse1;
import Challenger.Reponse.Reponse2;
import Challenger.Reponse.Reponse3;
import Challenger.Reponse.Reponse4;
public class DComparateur {
	static int Correct = 0 ;
	 int B1 = Container1.B1 ;
	 int B2 = Container2.B2 ;
	 int B3 = Container3.B3 ;
	 int B4 = Container4.B4 ;
	 JOptionPane jop1 = new JOptionPane();
	 
	 int Rep1 = DReponse1.DR1 ;
	 int Rep2 = DReponse2.DR2 ;
	 int Rep3 = DReponse3.DR3 ;
	 int Rep4 = DReponse4.DR4 ;
	 public static int Correction1 = 0 ;
	 public static int Correction2 = 0 ;
	 public static int Correction3 = 0 ;
	 public static int Correction4 = 0 ;
	 
	 public DComparateur() {
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
				
			 jop1.showMessageDialog(null, "L'IA A GAGNEE", "Information", JOptionPane.INFORMATION_MESSAGE);
			//  new Reload() ;
		  }
		 
	 }


	private void Comp1() {
		System.out.println("B1="+B1);
		if (B1 == Rep1) {
			System.out.println("B1 est correct");
			Correction1 = 1 ;
			
		 }
		 else if(B1 == Rep2 || B1==Rep3 || B1 == Rep4) {
			 System.out.println("La couleur de B1 est mal placé");
			Correction1 = 2 ;
		 }
	
			
		
		 else {
			 System.out.println("La couleur de B1 n'est pas en en jeu");
			Correction1 = 3 ;
		 }
		
	}
	
	private void Comp2() {
		System.out.println("B2="+B2);
		if (B2 == Rep2) {
			System.out.println("B2 est correct");
			Correction2 = 1 ;
		 }
		 else if(B2 == Rep1 || B2==Rep3 || B2==Rep4) {
			 System.out.println("La couleur de B2 est mal placé");
			 Correction2 = 2 ; 
		 }
		 else {
			 System.out.println("La couleur de B2 n'est pas en en jeu");
			 Correction2 = 3 ;
		 }
	}
	private void Comp3() {
		System.out.println("B3="+B3);
		if (B3 == Rep3) {
			System.out.println("B3 est correct");
			Correction3 = 1 ;
		 }
		 else if(B3 == Rep1 || B3==Rep2 || B3==Rep4) {
			 System.out.println("La couleur de B3 est mal placé");
			 Correction3 = 2 ;
		 }
		
		 else {
			 System.out.println("La couleur de B3 n'est pas en en jeu");
			 Correction3 = 3 ;
		 }
	}
	private void Comp4() {
		System.out.println("B4="+B4);
		if (B4 == Rep4) {
			System.out.println("B4 est correct");
			Correction4 = 1 ;
		 }
		 else if(B4 == Rep1 || B4==Rep2 || B4==Rep3) {
			 System.out.println("La couleur de B4 est mal placé");
			 Correction4 = 2 ;
		 }
		
		 else {
			 System.out.println("La couleur de B4 n'est pas en en jeu");
			 Correction4 = 3 ;
		 }
	}
	private void Correct() {
		if(B1==Rep1 && B2==Rep2 && B3==Rep3 && B4==Rep4) {
			Correct = 1 ;
		}
		
	}
}
