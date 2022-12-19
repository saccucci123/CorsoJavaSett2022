package srl.neotech.autosalone;

public class Accessorio {
	
	
	private Integer id;
	private enum classe {interni,esterni};
	private enum tipologia {cerchi,interni,carplay};
	private String descrizione;
	private Integer costo;
	
	
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
	public Integer getCosto() {
		return costo;
	}
	public void setCosto(Integer costo) {
		this.costo = costo;
	}
	
	
	
	
	
	
	

}
