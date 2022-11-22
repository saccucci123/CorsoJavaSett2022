package srl.neotech.corsojava.aeroporto;

public class Passeggero {
	private Integer idUnivoco;
	private char mf;
	private boolean hasFiore;
	private Integer eta;
	private boolean haBagagli;
	
	
	
	
	
	
	
	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public char getMf() {
		return mf;
	}
	public void setMf(char mf) {
		this.mf = mf;
	}
	public boolean isHasFiore() {
		return hasFiore;
	}
	public void setHasFiore(boolean hasFiore) {
		this.hasFiore = hasFiore;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	public boolean isHaBagagli() {
		return haBagagli;
	}
	public void setHaBagagli(boolean haBagagli) {
		this.haBagagli = haBagagli;
	}
	@Override
	public String toString() {
		return "Passeggero [idUnivoco=" + idUnivoco + ", mf=" + mf + ", hasFiore=" + hasFiore + ", eta=" + eta
				+ ", haBagagli=" + haBagagli + "]";
	}
	}
