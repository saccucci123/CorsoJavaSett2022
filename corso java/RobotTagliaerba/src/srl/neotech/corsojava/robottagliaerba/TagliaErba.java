package srl.neotech.corsojava.robottagliaerba;

public class TagliaErba extends CampoDiCalcio {

	Striscia strisciaInElaborazione;
	Integer passo;
	String stato;
	Integer altezzaLama;
	
	
	
	
	public Striscia getStrisciaInElaborazione() {
		return strisciaInElaborazione;
	}
	public void setStrisciaInElaborazione(Striscia strisciaInElaborazione) {
		this.strisciaInElaborazione = strisciaInElaborazione;
	}
	public Integer getPasso() {
		return passo;
	}
	public void setPasso(Integer passo) {
		this.passo = passo;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public Integer getAltezzaLama() {
		return altezzaLama;
	}
	public void setAltezzaLama(Integer altezzaLama) {
		this.altezzaLama = altezzaLama;
	}
	
	
	public void tagliaStriscia() {
		for(int i=0; i<80; i++) {
			avanzaDiUnPasso();
		}
		
		if(this.getStrisciaInElaborazione().getNumeroStriscia()%2==0) gira(2,"DX");
		else gira(2,"SX");
	}
	private void avanzaDiUnPasso() {
		passo++;
		
		System.out.println("Passo:"+passo+"In taglio"+stato);
		
		

	}
	
	private void gira(Integer numeroRotazioni, String direzione) {
		if(direzione== "Sx" && numeroRotazioni ==2){
        System.out.println("Rotazione Sx");
		}
		else System.out.println("Rotazione Dx");
		
		

		}
	
	
	 
	
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

