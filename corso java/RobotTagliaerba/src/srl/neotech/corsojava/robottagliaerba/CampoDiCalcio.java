package srl.neotech.corsojava.robottagliaerba;

import java.util.ArrayList;

public class CampoDiCalcio {

	ArrayList<Striscia> striscie=new ArrayList<Striscia>();

	public ArrayList<Striscia> getStriscie() {
		return striscie;
	}

	public void setStriscie(ArrayList<Striscia> striscie) {
		this.striscie = striscie;
		for(int i=1; i<=10; i++) {
			Striscia s=new Striscia();
			s.setNumeroStriscia(i);
			striscie.add(s);
			
			}
	}

	
	public void prova() {
		
		
		
	}
	
	
  
	}
	

	
	
	

