package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AutosaloneController {
	
	
	@GetMapping (value="salone")
	public String auto() {
	
return "autosalone";

}
}