package srl.neotech.corsojava.calcoloesame;

import java.util.ArrayList;
import java.util.Random;

public class Startup {
		
	public static void main(String[] args) {
	
	 ArrayList <Integer> prova=new ArrayList <Integer>();	
	 
	 Random rnd=new Random();
	 
	 Integer provaSritta = rnd.nextInt(-8,8);
	 prova.add(0, provaSritta);
	 System.out.println("Prova scritta "+prova.get(0));
	 
	 Integer provaOrale= rnd.nextInt(0,24);
	 prova.add(1, provaOrale);
	 System.out.println("Prova orale "+prova.get(1));
	 
	 
	 Integer somma=prova.get(0)+prova.get(1);
	 
	 System.out.println("La somma delle prove e' "+somma);
	 
	 
	 if(prova.get(0)<=0 && somma>18)
		 System.out.println("Lo studente viene bocciato");
	 
	 else if(prova.get(0)<=0 && prova.get(1)<18) 
		 System.out.println("Lo studente e bocciato");
	 else if(prova.get(0)>0 && somma>18)
		 System.out.println("Lo studente viene bocciato");
	 
	 else if (somma==31||somma==32)
		 System.out.println("Congratulazioni: 30 e lode ");
	 else
		 System.out.println("Promosso");
	 
	 
	 
	 
	 
	 
		 
		 
	 
	 
	 
	 
   
		
		
		
		
	 
		
		
		
		
		
		
		
		
		
		
		

	}

}
