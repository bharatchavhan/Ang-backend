package com.neosoft.task.poc.service;

import java.util.List;

import com.neosoft.task.poc.model.Experience;

public interface CategoryService {
	Experience saveCategory(Experience user);
	
	List<Experience> getAll();
	
	Experience getbyId(int id);
	
	String deleteById(int id );
	
	List<Experience> getByExperience(String exp);
}
