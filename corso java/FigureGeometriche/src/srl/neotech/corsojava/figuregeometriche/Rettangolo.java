package srl.neotech.corsojava.figuregeometriche;

public class Rettangolo {
	
	private Integer base;
	private Integer altezza;
	
	
	
	public Integer getBase() {
		return base;
	}
	public void setBase(Integer base) {
		this.base = base;
	}
	public Integer getAltezza() {
		return altezza;
	}
	public void setAltezza(Integer altezza) {
		this.altezza = altezza;
	}
	
	public double area(double base,double altezza)
	{
		double area;
		area= base*altezza;
		return area;
		}
	public double perimetro(double base,double altezza)
	 {
		double perimetro;
		perimetro=(2*base)+(2*altezza);
		return perimetro;
		
	 }
	
	

	
	
	
	
	
	
	
	
	
	
	

}
