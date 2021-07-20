package com.original.gestaografo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.original.gestaografo.domain.Graph;
import com.original.gestaografo.services.GraphService;

@RestController
@RequestMapping(value="/graph")
public class GraphResource {
	
	@Autowired
	private GraphService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {		//ResponseEntity é um metodo complexo que tem retorno com protocolo https
		
		Graph obj = service.localizar(id);
		return ResponseEntity.ok().body(obj);
		
	}


}
