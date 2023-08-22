package com.example.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeMessage {
     	@GetMapping("sh")
     	public String Welcome()
     	{
     		return "Welcome";
     	}
}
