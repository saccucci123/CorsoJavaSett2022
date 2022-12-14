package srl.neotech.model;

public class Elemento {

	private Integer id;
	private String descrizione;
	private Motore motore;
	
	public Elemento() {
		
	}
	
	//Costruttore pubblico con tutti i parametri
	public Elemento (Integer id, String descrizione) {
		this.id=id;
		this.descrizione=descrizione;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Motore getMotore() {
		return motore;
	}

	public void setMotore(Motore motore) {
		this.motore = motore;
	}
	
	
	
}
