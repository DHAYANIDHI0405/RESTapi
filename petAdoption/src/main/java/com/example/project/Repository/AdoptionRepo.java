package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.AdoptionModel;

public interface AdoptionRepo extends JpaRepository<AdoptionModel, Integer> {

}
