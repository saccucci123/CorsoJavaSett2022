package srl.neotech.corsojava.java04;

import java.util.ArrayList;

public class Startup {

	public static ArrayList<Prodotti> listaProdotti=new ArrayList<Prodotti>();
	
	
	
	public static void main(String[] args) {
		
		
		for(int i=0; i<100; i++) {
			
        Alimenti alim=new Alimenti();
		
		alim.setDescrizione("iphone");
		alim.setPrezzoUnitario(10);
		alim.setDataDiScadenza("24/11/2022");
		alim.setCodiceUnivoco("BT5626272882929");
		
		listaProdotti.add(alim);
		}
		
		for(int i=0; i<100; i++) {
		NonAlimenti non=new NonAlimenti();
		
		non.setDescrizione("casse");
		non.setMaterialePrincipale("plastica");
		non.setPrezzoUnitario(56);
		non.setCodiceUnivoco("BY26627282829020");
		
         listaProdotti.add(non);
		
		
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
