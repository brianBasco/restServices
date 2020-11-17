package com.example.restServices;

import com.example.restServices.entities.Produit;
import com.example.restServices.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServicesApplication.class, args);
	}


	@Autowired
	private ProduitRepository produitRepository;

	@Bean
	public CommandLineRunner start() {
		return (args) -> {

			produitRepository.save(new Produit(null, "Ord HP 54", 60000,3 ));
			produitRepository.save(new Produit(null, "imprimante Epson", 2000,13 ));
			produitRepository.save(new Produit(null, "smartphone", 300,23 ));

		};
	}
}
