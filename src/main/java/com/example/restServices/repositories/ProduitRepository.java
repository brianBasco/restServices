package com.example.restServices.repositories;

import com.example.restServices.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {


}
