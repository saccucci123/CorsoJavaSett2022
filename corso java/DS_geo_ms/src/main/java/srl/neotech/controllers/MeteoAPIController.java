package srl.neotech.controllers;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import srl.neotech.requestresponse.GetListaComuniAutocompleteReponse;
import srl.neotech.requestresponse.GetListaComuniResponse;
import srl.neotech.requestresponse.GetListaProvinceResponse;
import srl.neotech.requestresponse.GetListaRegioniResponse;
import srl.neotech.requestresponse.GetMeteoResponse;


public class MeteoAPIController {

	@ResponseBody
	@GetMapping(value = "/listaRegioni",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaRegioniResponse getListaRegioni() {
		
		//inizializzo la response
		GetListaRegioniResponse response=new GetListaRegioniResponse();
		
		try {
			//chiamo il service
			//ArrayList<Regione> listaRegioni = elementoService.getListaelementi();
			
			//preparo la response
			//response.setElementi(listaRegioni);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	@ResponseBody
	@GetMapping(value = "/listaProvince",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaProvinceResponse getListaProvince(@PathVariable ("id") Integer idRegione) {
		
		//inizializzo la response
		GetListaProvinceResponse response=new GetListaProvinceResponse ();
		
		try {
			//chiamo il service
			//ArrayList<Regione> listaRegioni = elementoService.getListaelementi();
			
			//preparo la response
			//response.setElementi(listaRegioni);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	@ResponseBody
	@GetMapping(value = "/listaComuni",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaComuniResponse getListaComuni(@PathVariable ("id") Integer idProvincia) {
		
		//inizializzo la response
		GetListaComuniResponse response=new GetListaComuniResponse ();
		
		try {
			//chiamo il service
			//ArrayList<Regione> listaRegioni = elementoService.getListaelementi();
			
			//preparo la response
			//response.setElementi(listaRegioni);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	@ResponseBody
	@GetMapping(value = "/listaComuniAutocomplete",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaComuniAutocompleteReponse getListaComuniAutocomplete(@PathVariable ("text") String text) {
		
		//inizializzo la response
		GetListaComuniAutocompleteReponse response=new GetListaComuniAutocompleteReponse ();
		
		try {
			//chiamo il service
			//ArrayList<Regione> listaRegioni = elementoService.getListaelementi();
			
			//preparo la response
			//response.setElementi(listaRegioni);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	
	@ResponseBody
	@GetMapping(value = "/getMeteo",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetMeteoResponse getMeteo(@PathVariable ("id") Integer idComune) {
		
		//inizializzo la response
		GetMeteoResponse response=new GetMeteoResponse ();
		
		try {
			//chiamo il service
			//ArrayList<Regione> listaRegioni = elementoService.getListaelementi();
			
			//preparo la response
			//response.setElementi(listaRegioni);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	
	
}