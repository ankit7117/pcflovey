package com.example.jenkinspcf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pcf")
public class pcfController {

	
	@GetMapping
	public String getHi() {
		
		return "hello";
	}
	
}
