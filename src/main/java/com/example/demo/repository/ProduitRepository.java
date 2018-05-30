package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
