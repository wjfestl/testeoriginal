package com.original.gestaografo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.original.gestaografo.repositories.GraphRepository;

@SpringBootApplication
public class GestaografoApplication {

	@Autowired
	private GraphRepository graphRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestaografoApplication.class, args);
	}

	
//	@Override
//	public void run(String... args) throws Exception {
//
//		Graph gr1 = new Graph(null, "J", "F", 11);
//		Graph gr2 = new Graph(null, "G", "H", 8);
//
//		graphRepository.saveAll(Arrays.asList(gr1, gr2));
//
//	}	

}
