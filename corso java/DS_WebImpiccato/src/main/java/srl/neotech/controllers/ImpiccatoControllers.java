package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ImpiccatoControllers {

	
	
	
@GetMapping(value="game")
	
	public String webApp() {
		
		return"Impiccato";
}
}
