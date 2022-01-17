package com.neosoft.task.poc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.task.poc.model.Experience;

public interface Repo extends JpaRepository<Experience, Integer>{

	Experience findById(int id);
	
	String deleteById(int id);
	
	List<Experience> findByExperience(String exp);
}
