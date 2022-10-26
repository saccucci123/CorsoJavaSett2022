package srl.neotech.corso.liste.giocattoli;

import java.util.ArrayList;

public static 	ArrayList<String> listeGiocattoli=new ArrayList<String>();

public class Startup {

	public static void main(String[] args) {
		
	
		
	
		
		for(int i=0; i<=800; i++) {
		Giocattoli giochiamo=new Giocattoli();
		listeGiocattoli.add(" Giocattoli "+i);
		
		System.out.println(listeGiocattoli.get(i));
		
		giochiamo.materiale="plastica";
		
		System.out.println("Il materiale e di "+giochiamo.materiale);
		
		
		if(listeGiocattoli.size()>=0&&listeGiocattoli.size()<=100) {
			
			System.out.println("Il colore  rosso ");
			
		}
		else if(listeGiocattoli.size()>=101&&listeGiocattoli.size()<=200) {
			
			System.out.println("Il colore e verde ");
			}
		else if(listeGiocattoli.size()>=201&&listeGiocattoli.size()<=300) {
			
			System.out.println("Il colore e viola  ");	
			
		}
		
		else if(listeGiocattoli.size()>=301&&listeGiocattoli.size()<=400) {
		
			System.out.println("Il colore e viola  ");	
		}
			else {

			System.out.println("il colore e nero ");
			
		
		}
		
		
		}
		
		
		
		
		
	}
}
