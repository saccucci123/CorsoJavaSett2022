package srl.neotech.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import srl.neotech.auto.Auto;
@Controller
public class ForzaControllers {

	
@Autowired

Auto motore;
@GetMapping(value="forza1")
	public String webApp() {
	motore.getGt().setCavalli(300);
	motore.getGt().setCilindrata(2000);
	motore.getGt().setNomeMarca("ecoboost");
	System.out.println(motore.getGt().getNomeMarca());
	System.out.println(motore.getGt().getCilindrata());
	System.out.println(motore.getGt().getCavalli());
	return"forza";
}
}

