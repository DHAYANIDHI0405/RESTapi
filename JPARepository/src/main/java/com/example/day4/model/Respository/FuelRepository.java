package com.example.day4.model.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day4.model.entity.Zoo;

public interface FuelRepository extends JpaRepository<Zoo, Integer>{

}
