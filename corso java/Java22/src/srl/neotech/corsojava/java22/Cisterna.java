package srl.neotech.corsojava.java22;

public class Cisterna {
	
	private Integer quantita;
	private Integer evapPerDay;
	private Integer livelloGas;
	private String tipo;
	
	
	
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
		System.out.println("La quantita e "+quantita);
	}
	public Integer getEvapPerDay() {
		return evapPerDay;
	}
	public void setEvapPerDay(Integer evapPerDay) {
		this.evapPerDay = evapPerDay;
		System.out.println("L'evaporazione "+evapPerDay);
	}
	public Integer getLivelloGas() {
		return livelloGas;
	}
	public void setLivelloGas(Integer livelloGas) {
		this.livelloGas = livelloGas;
		System.out.println( "Il livello gas "+livelloGas);
		}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
		System.out.println("Il tipo "+tipo);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
