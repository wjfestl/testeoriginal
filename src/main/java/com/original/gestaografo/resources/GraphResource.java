package com.original.gestaografo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.original.gestaografo.domain.Graph;

@RestController
@RequestMapping(value="/graph")
public class GraphResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Graph> imprimir() {		
		
		List<Graph> lista = new ArrayList<>();
		
		return lista;
		
	}

}
