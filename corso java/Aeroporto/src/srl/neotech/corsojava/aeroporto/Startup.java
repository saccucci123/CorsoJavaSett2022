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
    
    
    for(int i=0; i<=100; i++) {
    	
    Aereo aereiInPartenza=new Aereo();
    
    Integer randomDistanzaAeroporto=rnd.nextInt(1,500);
    Integer randomVelocita=rnd.nextInt(1,10);
    String  compagnia=f.company().name();
    Integer idUnivico=f.number().randomDigit();
    
    
    
        aereiInPartenza.setCompagniaAerea(compagnia);
        aereiInPartenza.setIdUnivico(idUnivico);
    	aereiInPartenza.setDistanzaDallAeroporto(randomDistanzaAeroporto);
    	aereiInPartenza.setOrario(0);
    	aereiInPartenza.setVelocita(randomVelocita);
    	
    	
    	
    aereiInPartenza.setStato(aereiInPartenza.getStato().IN_PARTENZA);
    aereiInPartenza1.add(aereiInPartenza);
    }
    for(int j=0; j<=200; j++) {
    Aereo aereiInAvvicinamento=new Aereo();
    
    String  compagnia=f.company().name();
    Integer idUnivico=f.number().randomDigit();
    Integer randomDistanzaAeroporto=rnd.nextInt(1,500);
    Integer randomVelocita=rnd.nextInt(1,10);
    Integer randomOrario=rnd.nextInt(1,140);
    
    aereiInAvvicinamento.setCompagniaAerea(compagnia);
    aereiInAvvicinamento.setIdUnivico(idUnivico);
	aereiInAvvicinamento.setDistanzaDallAeroporto(randomDistanzaAeroporto);
	aereiInAvvicinamento.setOrario(randomOrario);
	aereiInAvvicinamento.setVelocita(randomVelocita);
    
aereiInAvvicinamento.setStato(aereiInAvvicinamento.getStato().IN_AVVICINAMENTO);
    
    aereiInAvvicinamento1.add(aereiInAvvicinamento);
      
       }
    
    
   for(int k=0; k<=1000; k++) {
    Passeggero prontiPerCheckin=new Passeggero();
    
    
   
    Integer eta=f.number().numberBetween(3, 90);
    Integer idUnivico=f.number().randomDigit();

    
    prontiPerCheckin.setIdUnivoco(idUnivico);
    prontiPerCheckin.setEta(eta);
    
    
    
     Integer tipo=rnd.nextInt(1,3);
     
    if(tipo==1) prontiPerCheckin=new Business();
    else if(tipo==2) prontiPerCheckin=new Turista();
    else prontiPerCheckin=new Excelsior();
    
    }
   System.out.println("IN PARTENZA");
   for(Aereo aereoInPartenza:aereiInPartenza1) {
       System.out.println(aereoInPartenza);
   }
   System.out.println("IN ARRIVO");
   for(Aereo aereoInArrivo:aereiInAvvicinamento1) {
       System.out.println(aereoInArrivo);
   }



 
   
	
    }
    
  }


