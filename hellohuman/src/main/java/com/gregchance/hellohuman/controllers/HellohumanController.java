package com.gregchance.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellohumanController {
	
	@RequestMapping("/")
	public String hello(@RequestParam(value="name", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "Hello human";
		}
		return ("Hello "+searchQuery);
	}
}
