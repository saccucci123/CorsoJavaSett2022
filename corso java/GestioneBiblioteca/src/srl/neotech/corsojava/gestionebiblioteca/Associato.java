package srl.neotech.corsojava.gestionebiblioteca;

import java.util.ArrayList;

public class Associato {
	
	private Integer idAssociato;
	private String nominato;
	enum stato{attivo,rimosso}
	private String stato;
	
	private ArrayList<Libro> listaIdPresi=new ArrayList <Libro>();
	
	
	 
	
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
		return "Associato [idAssociato=" + idAssociato + ", nominato=" + nominato + ", stato=" + stato
				+ ", listaIdPresi=" + listaIdPresi + "]";
	}
	


	

	
	
	
	
	
	
	
	
	
	
	
	

}
