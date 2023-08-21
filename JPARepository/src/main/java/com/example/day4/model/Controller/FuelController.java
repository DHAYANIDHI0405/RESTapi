package com.example.day4.model.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4.model.Service.FuelService;
import com.example.day4.model.entity.Zoo;

@RestController
public class FuelController {

	@Autowired
	FuelService fser;
	@PostMapping("/saveFuel")
	
	public Zoo saveFuelStationDe(@RequestBody Zoo z)
	{
		return fser.saveDetails(z);
	}
	@GetMapping("/getFuel")
	public List<Zoo> getFuelStationDe()
	{
		return fser.getDetails();
	}
}