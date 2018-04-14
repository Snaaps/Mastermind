package BOT;

import java.util.ArrayList;

import BOT.DContainer.DContainer1;
import BOT.DContainer.DContainer2;
import BOT.DContainer.DContainer3;
import BOT.DContainer.DContainer4;
import BOT.ProchainTour;
public class IA {
	public static int p = ProchainTour.p ;    //Valeur qui compte combien de tour 
	public static DContainer1 IABu1 = new DContainer1(); // Bouton de l'IA 1
	public static DContainer2 IABu2 = new DContainer2(); // Bouton de l'IA 2
	public static DContainer3 IABu3 = new DContainer3(); // Bouton de l'IA 3
	public static DContainer4 IABu4 = new DContainer4(); // Bouton de l'IA 4
	int Finish = 0 ; // Variable qui indique si le bot a Tout trouvé
	int C1C = 0 ;	//Variable qui indique si le bot a trouvé la 1ere Couleur
	int C2C = 0 ;	//Variable qui indique si le bot a trouvé la 2eme Couleur
	int C3C = 0 ;	//Variable qui indique si le bot a trouvé la 3eme Couleur
	int C4C = 0 ;	//Variable qui indique si le bot a trouvé la 4eme Couleur
	int BR1 = 0 ; // Prend la valeur de la bonne reponse du bouton 1
	int BR2 = 0 ; // Prend la valeur de la bonne reponse du bouton 2
	int BR3 = 0 ; // Prend la valeur de la bonne reponse du bouton 3
	int BR4 = 0 ; // Prend la valeur de la bonne reponse du bouton 4
	public static int valC1 = 0 ;	//Valeur de la  position de la couleur du bouton 1 a éssayer
	public static int valC2 = 1 ; //Valeur de la  position de la couleur du bouton 2 a éssayer
	public static int valC3 = 2 ; //Valeur de la  position de la couleur du bouton 3 a éssayer
	public static int valC4 = 3 ; //Valeur de la  position de la couleur du bouton 4 a éssayer
	ArrayList<Integer> CEJ1 = new ArrayList<Integer>(); //Liste des valeurs possible pour 1
	ArrayList<Integer> CEJ2 = new ArrayList<Integer>(); //Liste des valeurs possible pour 2
	ArrayList<Integer> CEJ3 = new ArrayList<Integer>(); //Liste des valeurs possible pour 3
	ArrayList<Integer> CEJ4 = new ArrayList<Integer>(); //Liste des valeurs possible pour 4
	ArrayList<Integer> CEJ1B = new ArrayList<Integer>(); //Liste des valeurs a ne plus choisir pour 1
	ArrayList<Integer> CEJ2B = new ArrayList<Integer>(); //Liste des valeurs a ne plus choisir pour 2
	ArrayList<Integer> CEJ3B = new ArrayList<Integer>(); //Liste des valeurs a ne plus choisir pour 3
	ArrayList<Integer> CEJ4B = new ArrayList<Integer>(); //Liste des valeurs a ne plus choisir pour 4
	
	
	public IA() {
		
		
			
		Tour(); 
			if ( C1C == 1) { 
				valC1 = BR1 ;
			}
			if ( C2C == 1) {
				valC2 = BR2 ;
			}
			if ( C3C == 1) {
				valC3 = BR3 ;
			}
			if ( C4C == 1) {
				valC4 = BR4 ;
			}
			if ( valC1 > 4 ){
		    	 valC1 = 0 ;
		    	}
			if ( valC2 > 4 ){
		    	 valC2 = 0 ;
		    	}
			if ( valC3 > 4 ){//if ( valC3 >= 5 ){
		    	 valC3 = 0 ;
		    	}
			if ( valC4 >= 5 ){
		    	 valC4 = 0 ;
		    	} 
			
			new Comparateur();
		/*	
			System.out.println("~~~~~");
			System.out.println("Valeur des boutons :");
			System.out.println(valC1);
			System.out.println(valC2);
			System.out.println(valC3);
			System.out.println(valC4);
			System.out.println("~~~~~"); */
			if (CEJ1.size()>0) {
			 System.out.println("CEJ1 :");
			 
			  System.out.print(CEJ1.get(0));
			 
			}
			if (CEJ2.size()>0) {
				 System.out.println("CEJ2 :");
				 
				  System.out.print(CEJ2.get(0));
				 }
				
			if (CEJ3.size()>0) {
				 System.out.println("CEJ3 :");
				
				  System.out.print(CEJ1.get(0));
				 
				}
			if (CEJ4.size()>0) {
				 System.out.println("CEJ4 :");
				
				  System.out.print(CEJ4.get(0));
				 
				}
			
			if (C1C==1 & C2C==1 & C3C==1 & C4C==1) {
				Finish = 1 ;
			}
		
		if (Finish == 1) {
			System.out.println("Le bot a trouvé");
		}
		System.out.println("-----------------------------------------------------------------------------");
	}
	
	
	void Tour() {
		System.out.println("~~~~");
		// Si la/les reponses sont Justes
		if( BOT.Comparateur.RBot1 == 1) {
			C1C = 1 ;
			System.out.println("Le bot a trouvé R1");
			BR1 = valC1 ;
		}
		if( BOT.Comparateur.RBot2 == 1) {
			C2C = 1 ;
			System.out.println("Le bot a trouvé R2");
			BR2 = valC2 ;
		}
		if( BOT.Comparateur.RBot3 == 1) {
			C3C = 1 ;
			System.out.println("Le bot a trouvé R3");
			BR3 = valC3 ;
		}
		if( BOT.Comparateur.RBot4 == 1) {
			C4C = 1 ;
			System.out.println("Le bot a trouvé R4");
			BR4 = valC4 ;
		}
	if (p < 5)	{
		// Si la/les reponses ne sont pas au bon endroit
		if( BOT.Comparateur.RBot1 == 2) {
			System.out.println("RBot1 =2 La reponse est mal placée");
			if (CEJ2.contains(valC1))	 {
				if (CEJ2.size()>0) {
					CEJ2.remove(valC1);
					CEJ2B.add(valC1);
					valC1 = CEJ2.get(0);
				}
				else {
				valC1++;
				}
			}
			else {
				if (CEJ2.size()>0) {
					valC1 = CEJ2.get(0);
				}
				else {
				valC1++;
				}
			}   
			if (CEJ3.contains(valC1))	 {
				if (CEJ3.size()>0) {
					CEJ3.remove(valC1);
					CEJ3B.add(valC1);
					valC1 = CEJ3.get(0);
				}
				else {
					
				valC1++;
				}
			}
			else {
				if (CEJ3.size()>0) {
					valC1 = CEJ3.get(0);
				}
				else {
				valC1++;
				}
			}  
			if (CEJ4.contains(valC1))	 {
				if (CEJ4.size()>0) {
					CEJ4.remove(valC1);
					CEJ4B.add(valC1);
					valC1 = CEJ4.get(0);
				}
				else {
					
				valC1++;
				}
			}
			else {
				if (CEJ4.size()>0) {
					valC1 = CEJ4.get(0);
				}
				else {
				valC1++;
				}
			}    
		}
		if( BOT.Comparateur.RBot2 == 2) {
			System.out.println("RBot2 =2 La reponse est mal placée");
			if (CEJ1.contains(valC2))	 {
				if (CEJ1.size()>0) {
					CEJ1.remove(valC2);
					CEJ1B.add(valC2);
					valC2 = CEJ1.get(0);
				}
				else {
				valC2++;
				}
			}
			else {
				if (CEJ1.size()>0) {
					valC2 = CEJ1.get(0);
				}
				else {
				valC2++;
				}
			}
			if (CEJ3.contains(valC2))	 {
				if (CEJ3.size()>0) {
					CEJ3.remove(valC2);
					CEJ3B.add(valC2);
					valC2 = CEJ3.get(0);
				}
				else {
				valC2++;
				}
			}
			else {
				if (CEJ3.size()>0) {
					valC2 = CEJ3.get(0);
				}
				else {
				valC2++;
				}
			}
			if (CEJ4.contains(valC2))	 {
				if (CEJ4.size()>0) {
					CEJ4.remove(valC2);
					CEJ4B.add(valC2);
					valC2 = CEJ4.get(0);
				}
				else {
				valC2++;
				}
			}
			else {
				if (CEJ4.size()>0) {
					valC2 = CEJ4.get(0);
				}
				else {
				valC2++;
				}
			}
		}
		if( BOT.Comparateur.RBot3 == 2) {
			System.out.println("RBot3 =2 La reponse est mal placée");
			if (CEJ1.contains(valC3))	 {
				if (CEJ1.size()>0) {
					CEJ1.remove(valC3);
					CEJ1B.add(valC3);
					valC3 = CEJ1.get(0);
				}
				else {
				valC3++;
				}
			}
			else {
				if (CEJ1.size()>0) {
					valC3 = CEJ1.get(0);
				}
				else {
				valC3++;
				}
			}
			if (CEJ2.contains(valC3))	 {
				if (CEJ2.size()>0) {
					CEJ2.remove(valC3);
					CEJ2B.add(valC3);
					valC3 = CEJ2.get(0);
				}
				else {
				valC3++;
				}
			}
			else {
				if (CEJ2.size()>0) {
					valC3 = CEJ2.get(0);
				}
				else {
				valC3++;
				}
			}
			if (CEJ4.contains(valC3))	 {
				if (CEJ4.size()>0) {
					CEJ4.remove(valC3);
					CEJ4B.add(valC3);
					valC3 = CEJ4.get(0);
				}
				else {
				valC3++;
				}
			}
			else {
				if (CEJ4.size()>0) {
					valC3 = CEJ4.get(0);
				}
				else {
				valC3++;
				}
			}
		}
		if( BOT.Comparateur.RBot4 == 2) {
			System.out.println("RBot4 =2 La reponse est mal placée");
			if (CEJ1.contains(valC4))	 {
				if (CEJ1.size()>0) {
					CEJ1.remove(valC4);
					CEJ1B.add(valC4);
					valC4 = CEJ1.get(0);
				}
				else {
				valC4++;
				}
			}
			else {
				if (CEJ1.size()>0) {
					valC4 = CEJ1.get(0);
				}
				else {
				valC4++;
				}
			}
			if (CEJ2.contains(valC4))	 {
				if (CEJ2.size()>0) {
					CEJ2.remove(valC4);
					CEJ2B.add(valC4);
					valC4 = CEJ2.get(0);
				}
				else {
				valC4++;
				}
			}
			else {
				if (CEJ2.size()>0) {
					valC4 = CEJ2.get(0);
				}
				else {
				valC4++;
				}
			}
			if (CEJ4.contains(valC4))	 {
				if (CEJ3.size()>0) {
					CEJ3.remove(valC4);
					CEJ3B.add(valC4);
					valC4 = CEJ3.get(0);
				}
				else {
				valC4++;
				}
			}
			else {
				if (CEJ4.size()>0) {
					valC4 = CEJ3.get(0);
				}
				else {
				valC4++;
				}
			}
		}
		
		//Si la/les reponses sont fausses
		if( BOT.Comparateur.RBot1 == 3) {
			System.out.println("RBot1 =3 La reponse n'est pas en jeu");
				if (CEJ1.size() > 0) {
					if(valC1 == (int) CEJ1.get(0)) {
						CEJ1.remove(0);
						valC1 = (int)CEJ1.get(1);
					}
					else {
					valC1 = (int) CEJ1.get(0) ;
					}
					}
			else {
			valC1=valC1+1;
			}
		}
		if( BOT.Comparateur.RBot2 == 3) {
			System.out.println("RBot2 =3 La reponse n'est pas en jeu");
				if (CEJ2.size() > 0) {
					if(valC2 == (int) CEJ2.get(0)) {
						valC2 = (int)CEJ2.get(1);
						CEJ2.remove(0);
					}
					else {
					valC2 = (int) CEJ2.get(0) ;
					}
			    }
				else {
					valC2=valC2+1;
					}
			}
		if( BOT.Comparateur.RBot3 == 3) {
			System.out.println("RBot3 =3 La reponse n'est pas en jeu");
				if (CEJ3.size() > 0) {
					if(valC3 == (int) CEJ3.get(0)) {
						valC3 = (int)CEJ1.get(1);
						CEJ3.remove(0);
					}
					else {
					valC3 = (int) CEJ3.get(0) ;
					}
					}
				else {
					valC3=valC3+1;
					}	
			}
		if( BOT.Comparateur.RBot4 == 3) {
			System.out.println("RBot4 =3 La reponse n'est pas en jeu");
			if (CEJ3.size() > 0) {
					if(valC4 == (int) CEJ4.get(0)) {
						valC4 = (int)CEJ1.get(1);
						CEJ4.remove(0);
					}
					else {
					valC4 = (int) CEJ4.get(0) ;
					}
			}
			else {
			valC4=valC4+1; 
			}
		}
		}
	else {
		if( BOT.Comparateur.RBot1 == 2) {
			valC1++ ;
		}
		if( BOT.Comparateur.RBot2 == 2) {
			valC2++;
		}
		if( BOT.Comparateur.RBot3 == 2) {
			valC3++;
		}
		if( BOT.Comparateur.RBot4 == 2) {
			valC4++;
		}
		
		
		if( BOT.Comparateur.RBot1 == 3) {
			valC1++;
		}
		if( BOT.Comparateur.RBot2 == 3) {
			valC2++;
		}
		if( BOT.Comparateur.RBot3 == 3) {
			valC3++;
		}
		if( BOT.Comparateur.RBot4 == 3) {
			valC4++;
		}
	}
	}
}
	
	
