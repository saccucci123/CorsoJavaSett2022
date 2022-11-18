package srl.neotech.corsojava.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aereo extends Aeroporto {
	
	private Integer idUnivico;
	private Integer orario;
	private String compagniaAerea;
	private List <Passeggero> passeggeri=new ArrayList<Passeggero>();
	private Integer velocita;
	private Integer distanzaDallAeroporto;
	private ModelloAereo modello;
	private Stato stato;
	
	
	public Integer getIdUnivico() {
		return idUnivico;
	}
	public void setIdUnivico(Integer idUnivico) {
		this.idUnivico = idUnivico;
	}
	public Integer getOrario() {
		return orario;
	}
	public void setOrario(Integer orario) {
		this.orario = orario;
	}
	public String getCompagniaAerea() {
		return compagniaAerea;
	}
	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}
	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(List<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public Integer getVelocita() {
		return velocita;
	}
	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}
	public Integer getDistanzaDallAeroporto() {
		return distanzaDallAeroporto;
	}
	public void setDistanzaDallAeroporto(Integer distanzaDallAeroporto) {
		this.distanzaDallAeroporto = distanzaDallAeroporto;
	}
	public ModelloAereo getModello() {
		return modello;
	}
	public void setModello(ModelloAereo modello) {
		this.modello = modello;
	}
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	@Override
	public String toString() {
		return "Aereo [idUnivico=" + idUnivico + ", orario=" + orario + ", compagniaAerea=" + compagniaAerea
				+ ", passeggeri=" + passeggeri + ", velocita=" + velocita + ", distanzaDallAeroporto="
				+ distanzaDallAeroporto + ", modello=" + modello + ", stato=" + stato + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
