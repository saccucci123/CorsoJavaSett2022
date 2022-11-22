package srl.neotech.corsojava.aeroporto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;

public class Startup {
    static List<Aereo> aereiInPartenza1=new ArrayList <Aereo>();
    static List<Aereo> aereiInAvvicinamento1=new ArrayList <Aereo>();
	public static void main(String[] args) {
	
		
	Aeroporto leonardoDaVinci=new Aeroporto();
	Random rnd=new Random();
    Faker f=new Faker();
    leonardoDaVinci.setRaggioDiAzione(100);
    
    
    for(int i=0; i<=100; i++) {
    	
    Aereo aereiInPartenza=new Aereo();
    ModelloAereo modello=new ModelloAereo();
    
        aereiInPartenza.setCompagniaAerea(f.company().name());
        aereiInPartenza.setIdUnivico(i);
    	aereiInPartenza.setDistanzaDallAeroporto(1);
    	aereiInPartenza.setOrario(1);
    	aereiInPartenza.setVelocita (1);
    	
     aereiInPartenza.setStato(aereiInPartenza.getStato().IN_PARTENZA);
     
     modello.setCostruttore(f.company().name());
     modello.setCapienzaNumPasseggeri(rnd.nextInt(1,200));
     modello.setCodiceModello(f.code().isbn13());
     aereiInPartenza.setModello(modello);
     
     
     
     for (int t=0; t<modello.getCapienzaNumPasseggeri(); t++) {
    	 
    	 
    	 Passeggero p=null;
    	 
    	 
    	 Integer sesso=rnd.nextInt(0,1);
    	 Integer tipo=rnd.nextInt(1,3);
    	 
    	 
    	 if(tipo==1) p=new Business();
    	 else if(tipo==2) p=new Turista();
    	 else if(tipo==3) p=new Excelsior();
    	 
    	 if(sesso==0) p.setMf('M');
    	 else p.setMf('F');
    	 
    	 p.setEta(rnd.nextInt(3,90));
    	 p.setIdUnivoco(t);
    	 p.setHasFiore(false);
    	 p.setHaBagagli(true);
    	 aereiInPartenza.getPasseggeri().add(p);
    	 
    	 
    }
    
    aereiInPartenza1.add(aereiInPartenza);
    
    }
    for(int j=0; j<=200; j++) {
    Aereo aereiInAvvicinamento=new Aereo();
    ModelloAereo modello1=new ModelloAereo();
    
    
    aereiInAvvicinamento.setCompagniaAerea (f.company().name());
    aereiInAvvicinamento.setIdUnivico(j);
	aereiInAvvicinamento.setDistanzaDallAeroporto(rnd.nextInt(0,500));
	aereiInAvvicinamento.setOrario(rnd.nextInt(1,140));
	aereiInAvvicinamento.setVelocita(rnd.nextInt(1,10));
    
aereiInAvvicinamento.setStato(aereiInAvvicinamento.getStato().IN_AVVICINAMENTO);

   modello1.setCostruttore(f.company().name());
   modello1.setCapienzaNumPasseggeri(rnd.nextInt(1,200));
   modello1.setCodiceModello(f.code().isbn13());
   aereiInAvvicinamento.setModello(modello1);

for (int l=0; l<modello1.getCapienzaNumPasseggeri(); l++) {
	 
	 
	 Passeggero p=null;
	 
	 
	 Integer sesso=rnd.nextInt(0,1);
	 Integer tipo=rnd.nextInt(1,3);
	 
	 
	 if(tipo==1) p=new Business();
	 else if(tipo==2) p=new Turista();
	 else if(tipo==3) p=new Excelsior();
	 
	 if(sesso==0) p.setMf('M');
	 else p.setMf('F');
	 
	 p.setEta(rnd.nextInt(3,90));
	 p.setIdUnivoco(l);
	 p.setHasFiore(false);
	 p.setHaBagagli(true);
	 aereiInAvvicinamento.getPasseggeri().add(p);
	 
	 
}
    
    aereiInAvvicinamento1.add(aereiInAvvicinamento);
      
       }
    
    for(int k=0; k<=1000; k++) {
    Passeggero p1=new Passeggero();
    
    Integer sesso=rnd.nextInt(0,1);
	 Integer tipo=rnd.nextInt(1,3);
	 
	 
	 if(tipo==1) p1=new Business();
	 else if(tipo==2) p1=new Turista();
	 else if(tipo==3) p1=new Excelsior();
	 
	 if(sesso==0) p1.setMf('M');
	 else p1.setMf('F');
	 
	 p1.setEta(rnd.nextInt(3,90));
	 p1.setIdUnivoco(k);
	 p1.setHasFiore(false);
	 p1.setHaBagagli(true);
    
    }
   System.out.println("IN PARTENZA");
   for(Aereo aereoInPartenza:aereiInPartenza1) {
       System.out.println(aereoInPartenza);
   }
   System.out.println("IN ARRIVO");
   for(Aereo aereoInArrivo:aereiInAvvicinamento1) {
       System.out.println(aereoInArrivo);
   }
   
  
   for(Aereo aereoInPartenza:aereiInPartenza1) {
      leonardoDaVinci.decollo(aereoInPartenza);
   }
   
   for(Aereo aereoInArrivo:aereiInAvvicinamento1) {
       leonardoDaVinci.atteraggio(aereoInArrivo);
   }
   }
   }
