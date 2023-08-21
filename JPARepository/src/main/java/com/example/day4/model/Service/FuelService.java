package com.example.day4.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4.model.Respository.FuelRepository;
import com.example.day4.model.entity.Zoo;

@Service

public class FuelService {
	@Autowired
	public FuelRepository frepo;
	
	//post the data
	public Zoo saveDetails(Zoo z)
	{
		return frepo.save(z);
	}
	public List<Zoo>getDetails()
	{
		return frepo.findAll();
	}
}
