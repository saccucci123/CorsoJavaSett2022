package srl.neotech.autosalone;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Automobile {
	
	
	private Integer id;
    private String targa;
    private enum costruttore {};
    private String modello;
    private enum alimentazione{};
    private Date annoDiCostruzione;
    private enum colore{};
    private Integer costo;
    private List<Accessorio> accessori = new ArrayList<Accessorio>();

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public Date getAnnoDiCostruzione() {
        return annoDiCostruzione;
    }
    public void setAnnoDiCostruzione(Date annoDiCostruzione) {
        this.annoDiCostruzione = annoDiCostruzione;
    }
    public Integer getCosto() {
        return costo;
    }
    public void setCosto(Integer costo) {
        this.costo = costo;
    }
    public List<Accessorio> getAccessori() {
        return accessori;
    }
    public void setAccessori(List<Accessorio> accessori) {
        this.accessori = accessori;
    }


	
	
	

}
