package PlusMoin;

import java.util.Random;
import java.util.Scanner;

public class PMChall {

	public PMChall() {
	Scanner scan = new Scanner(System.in);
    
   Random rand = new Random();
   int R1 = 0 ;
   int R2 = 0 ;
   int R3 = 0 ;
   int R4 = 0 ;
   int NM1 = rand.nextInt(9);
   int NM2 = rand.nextInt(9);
   int NM3 = rand.nextInt(9);
   int NM4 = rand.nextInt(9);
   int NombreMystere = (NM1 * 1000)+(NM2 * 100)+(NM3 * 10)+(NM4);
   System.out.println("Jeu du Plus ou Moins..");
   System.out.println(NombreMystere);
   System.out.println("Trouvez le nombre mystere entre 0000 et 9999 !");
       do{
       System.out.println("Veuillez entrer un nombre...");
       int Nombre=scan.nextInt();   
       byte N1 =  (byte) (Nombre/1000) ;
       byte N2 = (byte) ((byte) (Nombre/100)-(N1*10));
       byte N3 = (byte) ((byte) (Nombre/10)-(N1*100)-(N2*10));
       byte N4 = (byte) ((byte) (Nombre)-(N1*1000)-(N2*100)-(N3*10));
       System.out.println(N1+" "+N2+" "+N3+" "+N4);
       
       
       if (N1<NM1)
           {
           System.out.print("+");
           
           
           Reload.essais++ ;
           }
       else if (N1>NM1)
           {
           System.out.print("-");
           
           Reload.essais++ ;
           }
       else
           {
           System.out.print("=");
           
           Reload.essais++ ;
            R1 = 1 ;
           }
       
       
       
       if (N2<NM2) {
       	System.out.print("+");
       }
       else if (N2>NM2) {
       	System.out.print("-");
       }
       else {
       	System.out.print("=");
       	R2 = 1 ;
       }
       
       
       
       
       if (N3<NM3) {
       	System.out.print("+");
       }
       else if (N3>NM3) {
       	System.out.print("-");
       }
       else {
       	R3 = 1 ;
       	System.out.print("=");
       }
       
       
       
       if (N4<NM4) {
       	System.out.println("+");
       }
       else if (N4>NM4) {
       	System.out.println("-");
       }
       else {
       	System.out.println("=");
       	R4 = 1 ;
       }
       int R = R1+R2+R3+R4 ;
       Reload.R = R ;
       if(R==4) {
    	   Reload.reload();
       }
       }
       
       while(Nombre!=NombreMystere);
}
}
