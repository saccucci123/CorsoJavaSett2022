package srl.neotech.corsojava.java10;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		

		Random rnd=new Random(); 
		for(int i=0;i<10;i++) {          
		int numeroScelto=rnd.nextInt(10-1)+1;
		if(numeroScelto>=1&&numeroScelto<=10)
		System.out.println("E' uscito il: " +numeroScelto);
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
