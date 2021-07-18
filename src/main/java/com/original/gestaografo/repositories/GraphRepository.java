package com.original.gestaografo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.original.gestaografo.domain.Graph;

@Repository
public interface GraphRepository extends JpaRepository<Graph, Integer>{
	
}
