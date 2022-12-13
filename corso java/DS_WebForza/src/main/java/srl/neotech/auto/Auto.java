package srl.neotech.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Auto {
	
    @Autowired
    private Motore gt;

	public Motore getGt() {
		return gt;
	}

	public void setGt(Motore gt) {
		this.gt = gt;
	}
    
    
    



	
}
