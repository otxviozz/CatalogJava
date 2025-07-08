package com.appcatalog.catalog.dto;

import java.io.Serializable;

import com.appcatalog.catalog.entities.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long Id;
	private String name;
	
	public CategoryDTO() {
		
	}
	
	public CategoryDTO(Category entity) {
		this.Id = entity.getId();
		this.name = entity.getName();
	}

	public CategoryDTO(long id, String name) {
		Id = id;
		this.name = name;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
