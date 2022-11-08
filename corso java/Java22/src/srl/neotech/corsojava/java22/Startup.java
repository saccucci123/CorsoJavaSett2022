package srl.neotech.corsojava.java22;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		
		
		Random r=new Random();
		
		Cantina c=new Cantina();
		c.setThreshold(45);
		
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
		
	
		}
		
		
		for(Cisterna cy: c.getCisterne()) {
			System.out.println(cy);
			Integer qtBibita=0;
			if(cy.getLivelloGas()>c.getThreshold()) {
				qtBibita=qtBibita+cy.getQuantita();
				System.out.println("\n"+" la quantita di bibita venduta "+qtBibita+"\n");
				cy.setLivelloGas((cy.getLivelloGas()-cy.getEvapPerDay())*7);
				if(cy.getLivelloGas()>c.getThreshold())
				System.out.println("\n"+" quantita vendibile entro 7 giorni "+qtBibita+"\n");
				
				Integer giorni=0;
				while(qtBibita>0)
				{
			    qtBibita=0;
			    giorni++;
			    for(int j=1; j<=100; j++) {
			    if(cy.getLivelloGas()>c.getThreshold())	{
			    qtBibita=qtBibita+cy.getQuantita();
			    cy.setLivelloGas(cy.getLivelloGas()-cy.getEvapPerDay());
			    
			    }
			    	
			    	
			    	
			    }
				}
				System.out.println("\n"+"Numeri giorni in cui non e vendibile nessuna bibita: "+giorni+"\n");
			}
		    }
            }
		    }
