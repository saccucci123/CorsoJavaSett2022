package srl.neotech.model;

import java.awt.GraphicsDevice.WindowTranslucency;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.stereotype.Component;

@Component
public class Autosalone {

	private ArrayList<Automobile> automobili=new ArrayList<Automobile>();
	
	
	//Verrà chiamato da Spring, quando verrà avviata l'applicazione,  perchè è un Bean Component
	public Autosalone() {
		//popolare la lista delle autos...
		Automobile primaAuto=new Automobile();
		primaAuto.setId("1");
		primaAuto.setTarga("GL212GT");
		primaAuto.setColore(EColore.BLU);
		primaAuto.setAlimentazione(EAlimentazione.IBRIDO);
		primaAuto.setAnnoCostruzione("2022");
		primaAuto.setCostruttore(ECostruttore.BUGATTI);
		primaAuto.setModello("Veyron");
		primaAuto.setCosto(new BigDecimal("450670.50"));
		
	    Accessorio cerchiLega=new Accessorio();
	    cerchiLega.setId("1");
		cerchiLega.setClasse(EClasseAccessorio.ESTERNI);
		cerchiLega.setTipologia(ETipologiaAccessorio.CERCHI);
		cerchiLega.setCosto(new BigDecimal("3700.34"));
		
		   Automobile secondaAuto = new Automobile();
		   secondaAuto.setId("2");
	       secondaAuto.setTarga("GL230GH");
	       secondaAuto.setColore(EColore.NERO);
	       secondaAuto.setAlimentazione(EAlimentazione.BENZINA);
	       secondaAuto.setAnnoCostruzione("2022");
	       secondaAuto.setCostruttore(ECostruttore.FERRARI);
	       secondaAuto.setModello("Roma");
	       secondaAuto.setCosto(new BigDecimal("300009.50"));
	       
	       Automobile terzaAuto = new Automobile();

	        terzaAuto.setId("3");
	        terzaAuto.setTarga("GL228GH");
	        terzaAuto.setColore(EColore.ROSSO);
	        terzaAuto.setAlimentazione(EAlimentazione.BENZINA);
	        terzaAuto.setAnnoCostruzione("2022");
	        terzaAuto.setCostruttore(ECostruttore.LAMBORGHINI);
	        terzaAuto.setModello("Huracan");
	        terzaAuto.setCosto(new BigDecimal("400009.50"));
	        
	        Automobile quartaAuto = new Automobile();
	        
	        quartaAuto.setId("4");
	        quartaAuto.setTarga("GL230GE");
	        quartaAuto.setColore(EColore.NERO);
	        quartaAuto.setAlimentazione(EAlimentazione.BENZINA);
	        quartaAuto.setAnnoCostruzione("2022");
	        quartaAuto.setCostruttore(ECostruttore.MASERATI);
	        quartaAuto.setModello("MC20");
	        quartaAuto.setCosto(new BigDecimal("500009.50"));

	        primaAuto.getAccessori().add(cerchiLega);
	        automobili.add(primaAuto);
	        automobili.add(secondaAuto);
	        automobili.add(terzaAuto);
	        automobili.add(quartaAuto);
		
	
	}

	
	public ArrayList<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(ArrayList<Automobile> automobili) {
		this.automobili = automobili;
	}
	
	public Automobile getAutomobileById(String id) {
		
		   for(Automobile auto: automobili) {
		
			   if(auto.getId().equals(id)) {
				   return auto;
			   }
		   }
		   return null;

}
	
	public void removeAutoById(String idRemove) {
	    List<Automobile> automobiliDaRimuovere = new ArrayList<>();
	    
	    for (Automobile auto : automobili) {
	        if (auto.getId().equals(idRemove)) {
	            automobiliDaRimuovere.add(auto);
	        }
	    }
	    automobili.removeAll(automobiliDaRimuovere);
	}
	public List<Automobile> search(String searchTerm) {
	    // Inizializza una lista vuota di automobili
	    List<Automobile> result = new ArrayList<>();
	    // Itera sulla lista di automobili
	    for (Automobile auto : automobili) {
	        // Verifica se il modello o il marchio dell'automobile contiene la stringa di ricerca
	        if (searchTerm.equalsIgnoreCase(auto.getCostruttore().name()) 
	           || searchTerm.equalsIgnoreCase(auto.getAlimentazione().name()) 
	           || searchTerm.equalsIgnoreCase(auto.getColore().name()) 
	           || auto.getTarga().equals(searchTerm) || auto.getModello().equals(searchTerm)) {
	            // Aggiungi l'automobile alla lista dei risultati
	            result.add(auto);
	        }
	    }
	    // Restituisci la lista dei risultati
	    return result;
	}




	
}