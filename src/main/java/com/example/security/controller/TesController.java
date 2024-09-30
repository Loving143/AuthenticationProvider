package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesController {
	@GetMapping("/test")
	public String test() {
		return "This is the controller";
	}

}
