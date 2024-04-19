package com.springBootProjects.DogManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springBootProjects.DogManagementSystem.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}
