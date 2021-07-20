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

}
