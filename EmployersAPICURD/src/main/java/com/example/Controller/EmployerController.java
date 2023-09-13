package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployersEntity.EmployersEntity;

@RestController
public class EmployerController {
	
	
	@GetMapping("/api")
	public String show() {
		
		return "api";
	} 
	
	
	
	@PostMapping("/employes")
	public EmployersEntity create( EmployersEntity empl, @RequestParam ("id")int id,@RequestParam ("name")String name) {
		//employerRepositary.save(employersEntity);
		System.out.println(name);
		return empl;
	}
}
