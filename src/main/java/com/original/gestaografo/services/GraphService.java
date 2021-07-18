package com.original.gestaografo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.original.gestaografo.domain.Graph;
import com.original.gestaografo.repositories.GraphRepository;
import com.original.gestaografo.services.exceptions.ObjectNotFoundException;

@Service
public class GraphService {

	@Autowired
	private GraphRepository repo;

	public Graph localizar(Integer id) {
		Optional<Graph> obj = repo.findById(id); // vai no banco de dados e busca a categoria e retorna o objeto pronto.
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não localizado! Id: " + id + ", Tipo: " + Graph.class.getName()));

	}

}
