package srl.neotech.corsojava.figuregeometriche;

public class Startup {

	public static void main(String[] args) {
		

	Rettangolo calcoliamo=new Rettangolo();
	
	calcoliamo.setAltezza(5);
	calcoliamo.setBase(6);
	
	System.out.println("\nL'area del rettangolo e "+calcoliamo.area(calcoliamo.getAltezza(),calcoliamo.getBase()));
	System.out.println("\nIl perimetro del rettangolo e "+calcoliamo.perimetro(calcoliamo.getAltezza(),calcoliamo.getBase()));
	
	Quadrato calcoliamo1=new Quadrato();
	
	calcoliamo1.setAltezza(7);
	calcoliamo1.setBase(4);
	System.out.println("\nL'area del quadrato e "+calcoliamo1.area(calcoliamo1.getAltezza(),calcoliamo1.getBase()));
	System.out.println("\nIl perimetro del quadrato e "+calcoliamo1.perimetro(calcoliamo1.getAltezza(),calcoliamo1.getBase()));
	
}

}
