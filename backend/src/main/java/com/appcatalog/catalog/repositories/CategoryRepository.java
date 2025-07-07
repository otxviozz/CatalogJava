package com.appcatalog.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appcatalog.catalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {  //é uma interface que acessa o banco de dados
	
}
