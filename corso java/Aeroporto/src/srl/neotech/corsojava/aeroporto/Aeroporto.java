package srl.neotech.corsojava.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
	
	private List<Aereo>aerei=new ArrayList <Aereo>();
	private List <Passeggero>passeggeri=new ArrayList <Passeggero>();
	private Integer raggioDiAzione;
	
	
	
	public List<Aereo> getAerei() {
		return aerei;
	}
	public void setAerei(List<Aereo> aerei) {
		this.aerei = aerei;
	}
	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(List<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}
	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}
	
		
	
	
	
	
	public Aereo atteraggio(Aereo a) {
		while(a.getDistanzaDallAeroporto()>0){
		System.out.println("Aereo si sta avvcinando"+a.getIdUnivico());
		Integer distanzaAttuale=a.getDistanzaDallAeroporto()-a.getVelocita();
		a.setDistanzaDallAeroporto(distanzaAttuale);
		System.out.println("Blink"+a);
		}
		
    	System.out.println("Aereo"+a.getIdUnivico()+"e' atterato");
		a.setStato(Stato.ATTERATO);
		for(Passeggero p:a.getPasseggeri())
	    this.checkout(p);
		
	return a;
	}
	public Passeggero checkout(Passeggero b) {
		
		System.out.println("checkout"+b);
		if(b instanceof Excelsior) {	
		((Excelsior )b).setHaChampagne(true);
	     System.out.println("Il passeggero ha ricevuto uno champagne");
	   } else if(b instanceof Business){
		((Business )b).setHaGiornale(true);
		  System.out.println("Il passeggero ha ricevuto il giornale");}
		 else if(b.getMf()=='F'){
	       b.setHasFiore(true);
		     System.out.println("Il passeggero donna ha ricevuto un fiore ");}
			
	return b;
	}
	public Passeggero  checkin(Passeggero p) {
		
	    System.out.println("checkin aereo"+p);
	    
	    
	
			if(p instanceof Excelsior) {	
			((Excelsior )p).setHaChampagne(true);
				System.out.println("Il passeggero ha ricevuto uno champagne");
				} else if(p instanceof Business){
				((Business )p).setHaGiornale(true);
			    System.out.println("Il passeggero ha ricevuto il giornale");}
				else if(p.getMf()=='F'){
			   p.setHasFiore(true);
			   System.out.println("Il passeggero donna ha ricevuto un fiore ");}
			System.out.println("Il passeggero"+p.getIdUnivoco()+"imbarcato");
			
			  System.out.println("Paesseggeri totali"+p.getIdUnivoco());
        
	return p;
	}
	public Aereo decollo(Aereo d) {
		while(d.getDistanzaDallAeroporto()<this.raggioDiAzione){
		d.setStato(d.getStato().DECOLLATO);
		Integer distanzaAttuale=d.getDistanzaDallAeroporto()+d.getVelocita();
		d.setDistanzaDallAeroporto(distanzaAttuale);
	    System.out.println("Blink"+d);
			}
			
			System.out.println("Aereo"+d.getIdUnivico()+"E' fuori spazio aereo");
			d.setStato(d.getStato().FUORI_SPAZIO_AEREO);
			for(Passeggero p:d.getPasseggeri())
			this.checkin(p);
			
		return d;
	}
	}
