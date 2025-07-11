package com.appcatalog.catalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.appcatalog.catalog.dto.CategoryDTO;
import com.appcatalog.catalog.entities.Category;
import com.appcatalog.catalog.repositories.CategoryRepository;
import com.appcatalog.catalog.services.exceptions.EntityNotFoundException;

@Service //participa da injeção de dependência automatizada
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository; //meu JPA
	
	@Transactional(readOnly= true)
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();
		
		List<CategoryDTO> listDTO = list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		return listDTO;
	}

	@Transactional(readOnly= true)
	public CategoryDTO findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new CategoryDTO(entity);
	}
}
