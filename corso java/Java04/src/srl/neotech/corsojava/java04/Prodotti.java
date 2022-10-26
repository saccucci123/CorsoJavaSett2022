package srl.neotech.corsojava.java04;

public class Prodotti {

	
	private String codiceUnivoco;
	
	private String descrizione;
	
	private double prezzoUnitario;

	public String getCodiceUnivoco() {
		return codiceUnivoco;
		
	}

	public void setCodiceUnivoco(String codiceUnivoco) {
		this.codiceUnivoco = codiceUnivoco;
		System.out.println("Il codice unvico e'"+codiceUnivoco);
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
		System.out.println("La descrizione e'"+descrizione);
	}

	public double getPrezzoUnitario() {
		return prezzoUnitario;
		
	}

	public void setPrezzoUnitario(double prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
		double sconto=applicaSconto(prezzoUnitario);
		
		System.out.println("Il prezzo unitario e'"+sconto);
		
		
	}
	
	private double applicaSconto(double prezzo) {
		double applicaSconto=prezzo*5/100;
		prezzo=prezzo-applicaSconto;
		return prezzo;
		
	}
	
	
	
	
	
	
	
	
	
}
