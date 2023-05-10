package com.example.learn.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@RequestMapping("/potato")
@CrossOrigin(origins = "http://localhost:3000")

public class SupGordo {

  @GetMapping("/lies")
	ResponseEntity<String> message() {
		return new ResponseEntity<> ("Surprise is the hood!", HttpStatus.OK);
	}
  @GetMapping("/truth")
  	public String gettingMessage() {
		return "Alhambra is a G school!";
	}
  @GetMapping("/schools/{school}")
  	public String getSchool(@PathVariable String school) {
		String str = "";
	
		if (school.equals("Willow")) {
		str = "Sorry Sir, my dad will sue you.";
		}else if (school.equals("Alhambra")) {
		str = "What up, homie!";
		} else str = "hi";
		return str;
	}

}
