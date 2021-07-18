package com.original.gestaografo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/graph")
public class GraphResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String imprimir() {
		return "Bem-vindo ao SpringBoot";
	}

}
