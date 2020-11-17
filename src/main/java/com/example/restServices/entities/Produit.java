package com.example.restServices.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String designation;
    private double prix;
    private double quantite;
}
