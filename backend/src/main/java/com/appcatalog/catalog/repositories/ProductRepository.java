package com.appcatalog.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appcatalog.catalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {  //é uma interface que acessa o banco de dados
	
}
