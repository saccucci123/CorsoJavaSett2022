package srl.neotech.corsojava.java22;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		
		Cantina c=new Cantina();
		
		for(int i=1; i<=100; i++){

		Cisterna cisternaMia=new Cisterna();
		
		int num = r.nextInt(3-1)+1;
		if(num==1) cisternaMia.setTipo("alluminio ");
		else if(num==2) cisternaMia.setTipo("rame");
		else if(num==3) cisternaMia.setTipo("acciaio");
		
		int numQt = r.nextInt(1000-0)+0;
		cisternaMia.setQuantita(numQt);
		int numEv= r.nextInt(100-0)+0;
		cisternaMia.setEvapPerDay(numEv);
		int numGas= r.nextInt(100-0)+0;
		cisternaMia.setLivelloGas(numGas);
		c.getCisterne().add(cisternaMia);
		
		System.out.println("Cantina n "+i);
	    System.out.println("\n");
	    
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
