package BOT;
import Challenger.Comparateur;
import Duel.Reponse.*;

public class IA {
	public static int valC1 = 0 ;
	public static int valC2 = 0 ;
	public static int valC3 = 0 ;
	public static int valC4 = 0 ;
	int CEJ[] = {}; //Liste des couleurs en jeu,
	
	public IA() {
		
	}
	
	void Tour1() {
		valC1 = 1 ;
		valC2 = 2 ;
		valC3 = 3 ;
		valC4 = 4 ;
	}
	
	void Tour2() {
		
		// Si la/les reponses sont Justes
		if( BOT.Comparateur.RBot1 == 1) {
			
		}
		if( BOT.Comparateur.RBot2 == 1) {
			
		}
		if( BOT.Comparateur.RBot3 == 1) {
			
		}
		if( BOT.Comparateur.RBot4 == 1) {
			
		}
		
		// Si la/les reponses ne sont pas au bon endroit
		if( BOT.Comparateur.RBot1 == 2) {
			CEJ = new int[valC1];
		}
		if( BOT.Comparateur.RBot2 == 2) {
			CEJ = new int[valC2];
		}
		if( BOT.Comparateur.RBot3 == 2) {
			CEJ = new int[valC3];
		}
		if( BOT.Comparateur.RBot4 == 2) {
			CEJ = new int[valC4];
		}
		
		
		//Si la/les reponses sont fausses
		if( BOT.Comparateur.RBot1 == 3) {
			valC1=valC1+2;
		}
		if( BOT.Comparateur.RBot2 == 3) {
			valC2=valC2+2;
		}
		if( BOT.Comparateur.RBot3 == 3) {
			valC3=valC3+2;
		}
		if( BOT.Comparateur.RBot4 == 3) {
			valC4=valC4+2;
		}
		
		
		
	}
	
}
