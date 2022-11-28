package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class MusicController {

	@GetMapping(value="music")
	
	public String listMusic () {
		
		return"tabella";
}
}
