package srl.neotech.corsojava.java22;

public class Cisterna {
	
	private Integer quantita;
	private Integer evapPerDay;
	private Integer livelloGas;
	private String tipo;
	
	
	
	
	@Override
	public String toString() {
		return "Cisterna [quantita=" + quantita + ", evapPerDay=" + evapPerDay + ", livelloGas=" + livelloGas
				+ ", tipo=" + tipo + "]";
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
		
	}
	public Integer getEvapPerDay() {
		return evapPerDay;
	}
	public void setEvapPerDay(Integer evapPerDay) {
		this.evapPerDay = evapPerDay;
		
	}
	public Integer getLivelloGas() {
		return livelloGas;
	}
	public void setLivelloGas(Integer livelloGas) {
		this.livelloGas = livelloGas;
		
		}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
