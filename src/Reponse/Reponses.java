package Reponse;
import ListenerModJeu.* ;

import java.util.Random;
import BOT.Comparateur;
import BOT.ProchainTour;
import Defenseur.Valider;
public class Reponses {
	static Random r = new Random();
	static Random t = new Random();
	static Random y = new Random();
	static Random u = new Random();
		public static int Rep2 ;
	   public static int Rep1 ;
	   public static int Rep3 ;
	   public static int Rep4 ;
	   
	   public static int pp;
   
	public Reponses(){
		if (ListenerDefenseur.ModDEF == 1) {
			Rep1 = Valider.Rep1;
			Comparateur.Rep1 = Rep1 ;
			Rep2 = Valider.Rep2;
			Comparateur.Rep2 = Rep2 ;
			Rep3 = Valider.Rep3;
			Comparateur.Rep3 = Rep3 ;
			Rep4 = Valider.Rep4;
			Comparateur.Rep4 = Rep4 ;
			System.out.println("Reponses = "+Rep1+Rep2+Rep3+Rep4);
			pp = BOT.ProchainTour.p ;
		}
		else if (ListenerDuel.ModDUEL == 1) {
			 Rep1 = r.nextInt(5);
			 Comparateur.Rep1 = Rep1 ;
			 Rep2 = t.nextInt(5);
			 Comparateur.Rep2 = Rep2 ;
			 Rep3 = y.nextInt(5);
			 Comparateur.Rep3 = Rep3 ;
			 Rep4 = u.nextInt(5);
			 Comparateur.Rep4 = Rep4 ;
			 System.out.println("Reponses = "+Rep1+Rep2+Rep3+Rep4);
			 pp = Duel.ProchainTour.p;
		}
		else {
			
		}
	}
}
