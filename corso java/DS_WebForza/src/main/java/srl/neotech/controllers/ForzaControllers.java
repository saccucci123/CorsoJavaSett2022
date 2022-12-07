package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ForzaControllers {

	
@GetMapping(value="forza1")
	
	public String webApp() {
		
		return"forza";
}
}

