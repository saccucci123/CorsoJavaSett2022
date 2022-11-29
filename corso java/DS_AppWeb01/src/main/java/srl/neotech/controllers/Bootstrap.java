package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Bootstrap {

@GetMapping(value="bootstrap1")
	
	public String webApp() {
		
		return"static01";
}
	
	
	
	
	
	
	
	
}
