package srl.neotech.corsojava.fruttialbero;

public class Startup {

	public static void main(String[] args) {

		Albero diSilvio=new Albero();
	    Albero diFabrizio=new Albero();
	    
	    diSilvio.altezza=2;
	    diFabrizio.altezza=3;
	    
	    
	   diSilvio.diametro=4;
	   diFabrizio.diametro=6;
	   
	   diSilvio.eta=3;
	   diFabrizio.eta=5;
	   
	   
	    
	    diSilvio.isFruttifero=true;
	    diFabrizio.isFruttifero=false;
	    
	   
	   
	   System.out.println("L'albero di Silvio e raccoglibile "+diSilvio.raccolta());
	   System.out.println("L'albero di Fabrizio  e raccoglibile "+diFabrizio.raccolta());
	   System.out.println("L'albero di Silvio ha un diametro di  "+diSilvio.diametro+" E ha l'eta di "+diSilvio.eta);
	   System.out.println("L'albero di Fabrizio ha un diametro di  "+diFabrizio.diametro+" E ha l'eta di "+diFabrizio.eta);
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	    
		
		
		
		
		
		
	}

}
