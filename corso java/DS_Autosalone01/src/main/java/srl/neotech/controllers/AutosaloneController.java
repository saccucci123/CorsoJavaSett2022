package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import srl.neotech.model.Autosalone;

@Controller
public class AutosaloneController {

	@Autowired
	Autosalone autoSalone;
	
	@GetMapping("/listAuto")
	public String getListaAuto(ModelMap modelMap) {
		
		modelMap.addAttribute("listaAuto",autoSalone.getAutomobili());
		return "listaAuto";
	}
	
	/*
	 * @GetMapping("aggiungiAutomobile") public String add() { return
	 * "aggiungiAuto"; }
	 * 
	 * @PostMapping ("add") public String add1() { return"aggiungiAuto"; }
	 */
	
}
