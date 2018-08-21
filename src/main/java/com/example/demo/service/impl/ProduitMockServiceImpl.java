package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
import com.example.demo.service.ICrudService;

@Service
public class ProduitMockServiceImpl implements ICrudService<Produit, Long>{

	private List<Produit> produits;
	
	public ProduitMockServiceImpl(){
		produits = new ArrayList<Produit>();
		
		produits.add(new Produit("Livre", 50, 20));
		produits.add(new Produit("Cahier", 200, 5.25f));
		produits.add(new Produit("Stylo", 500, 2.10f));
	}
	
	
	@Override
	public List<Produit> getAll() {
		return produits;
	}

	@Override
	public void add(Produit produit) {
		produits.add(produit);
	}

	@Override
	public void update(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
	}

	@Override
	public void delete(Long id) {
		Produit produit = new Produit();
		produit.setId(id);
		produits.remove(produit);
	}


	@Override
	public void saveAll(Iterable<Produit> iterable) {
		Iterator<Produit> iterator = iterable.iterator();
		if(iterator.hasNext()) {
			produits.add(iterator.next());
		}
	}

}
