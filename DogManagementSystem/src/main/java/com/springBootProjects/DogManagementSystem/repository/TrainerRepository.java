package com.springBootProjects.DogManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.springBootProjects.DogManagementSystem.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
