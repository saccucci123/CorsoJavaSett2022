package srl.neotech.corsojava.fruttialbero;

public class Albero {

	public int eta;
	public int altezza;
	public int diametro;
	public boolean isFruttifero;
	
	public boolean  raccolta()  {
		
    boolean isRaccoglibileAMano=false;
    
    
    if(altezza<=5&&isFruttifero==true) isRaccoglibileAMano=true;
    
    return isRaccoglibileAMano;
    
    	
    	
    }
		
	}
	
	
	
	
	
	
	

