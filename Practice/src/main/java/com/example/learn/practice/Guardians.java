package com.example.learn.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guardians")
public class Guardians {

	@GetMapping("/members")
	    public String getMembers() {
	    return "Star-Lord, Gamora, Drax, Rockett, Groot, Nebula, Mantis, Kraglin";
	    
	    }
}


