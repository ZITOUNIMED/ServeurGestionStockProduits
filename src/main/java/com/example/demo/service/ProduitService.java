//package com.example.demo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.entity.Produit;
//import com.example.demo.repository.ProduitRepository;
//
//@Service
//public class ProduitService implements IProduitService{
//
//	@Autowired
//	private ProduitRepository produitRepository;
//	
//	@Override
//	public List<Produit> getProduits() {
//		return produitRepository.findAll();
//	}
//
//	@Override
//	public void addProduit(Produit produit) {
//		produitRepository.save(produit);
//	}
//
//	@Override
//	public void updateProduit(Produit produit) {
//		produitRepository.save(produit);
//	}
//
//	@Override
//	public void deleteProduit(Long id) {
//		Produit produit = new Produit();
//		produit.setId(id);
//		produitRepository.delete(produit);
//	}
//
//}
