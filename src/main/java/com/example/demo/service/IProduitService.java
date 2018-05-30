package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Produit;

public interface IProduitService {

	List<Produit> getProduits();
	
	void addProduit(Produit produit);
	
	void updateProduit(Produit produit);
	
	void deleteProduit(Long id);
}
