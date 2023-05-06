package com.example.learn.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/potato")
public class SupGordo {

  @GetMapping("/lies")
	public String getMessage() {
		return "Surprise is the hood!";
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
