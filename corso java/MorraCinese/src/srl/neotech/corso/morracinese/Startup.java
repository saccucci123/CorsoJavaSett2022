package srl.neotech.corso.morracinese;

import java.util.Scanner;

public class Startup {

	public static void main(String[] args) {
	
		
		
		String s1;
		String s2;
		
		
		Scanner ins= new Scanner(System.in);
		System.out.println("Benvenuti al gioco della morra cinese");
		System.out.println("Giocatore Andrea Spaccato : Sasso Carta Forbice ");
		s1=ins.next();
		System.out.println("Giocatore Marco benigni occhiali : Sasso Carta Forbice ");
		s2=ins.next();
if((s1.equals("Sasso") && s2.equals("Forbice"))||(s1.equals("Carta") && s2.equals("Sasso"))||(s1.equals("Forbice") && s2.equals("Carta")))
{
	System.out.println("Vince Giocatore Andrea Spaccato");
	}	else System.out.println("Vince Giocatore Marco benigni occhiali");
	

		
				
	
		
			
			
		
}

}
