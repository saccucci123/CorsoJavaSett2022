package srl.neotech.corsojava.java10_02;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {

		
		Random r=new Random();
		
		 int  numeroScelto=r.nextInt(10-1)+1;
		   System.out.println(numeroScelto);
		   while(numeroScelto%3!=0) {
			   numeroScelto=r.nextInt(10-1)+1;
			   System.out.println(numeroScelto);
			   
		  }
		   System.out.println("FINE CICLO WHILE");
		   

	   
		}

	}	
		


		
		
		
		
		
		
		

