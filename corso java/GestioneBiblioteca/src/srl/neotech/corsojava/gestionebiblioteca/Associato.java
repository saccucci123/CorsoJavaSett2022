package srl.neotech.corsojava.gestionebiblioteca;

public class Associato {
	
	private Integer idAssociato;
	private String nominato;
	enum stato{attivo,rimosso}
	private String stato;
	private Integer libriPresi;
	
   public Integer getLibriPresi() {
		return libriPresi;
	}
	public void setLibriPresi(Integer libriPresi) {
		this.libriPresi = libriPresi;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public Integer getIdAssociato() {
		return idAssociato;
	}
	public void setIdAssociato(Integer idAssociato) {
		this.idAssociato = idAssociato;
		
	}
	public String getNominato() {
		return nominato;
	}
	public void setNominato(String nominato) {
		this.nominato = nominato;
	}
	@Override
	public String toString() {
		return "Associato [idAssociato=" + idAssociato + ", nominato=" + nominato + ", stato=" + stato + ", libriPresi="
				+ libriPresi + "]";
	}
	


	

	
	
	
	
	
	
	
	
	
	
	
	

}
