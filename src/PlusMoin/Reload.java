package PlusMoin;

import java.util.Scanner;

public class Reload {

	public static int R =0 ;
	public static int essais  ;
	static Scanner scan = new Scanner(System.in);

	public static void reload() {
		if (R < 4) {
			 new PMChall();
		}
			else {
	       	System.out.println("Trouvé en " + essais + " essais !");
	       	System.out.println("Voulez vous rejouer ? Oui/Non");
	       	String Rejouer =scan.next(); 
	       	if (Rejouer.equals("Oui")) {
	       		System.out.println("System Relance");
	       		 new PMChall();
	       	}
	       	else if (Rejouer.equals("OUI")) {
	       		System.out.println("System Relance");
	       		 new PMChall();
	       	}
	       	else if (Rejouer.equals("oui")) {
	       		System.out.println("System Relance");
	       		 new PMChall();
	       	}
	       	else if (Rejouer.equals("Non") ) {
	       		System.out.println("System Exit");
	       		System.exit(0);
	       	}
	       	else if (Rejouer.equals("NON") ) {
	       		System.out.println("System Exit");
	       		System.exit(0);
	       	}
	       	else if (Rejouer.equals("non") ) {
	       		System.out.println("System Exit");
	       		System.exit(0);
	       	}
	       	else {
	       		System.out.println("Pas compris");
	       		reload();
	       	}
	}
	}
}
