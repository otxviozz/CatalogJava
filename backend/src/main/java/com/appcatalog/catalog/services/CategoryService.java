package com.appcatalog.catalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appcatalog.catalog.entities.Category;
import com.appcatalog.repositories.CategoryRepository;

@Service //participa da injeção de dependência automatizada
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository; //meu JPA
	
	public List<Category> findAll(){
		return repository.findAll();
	}

}
