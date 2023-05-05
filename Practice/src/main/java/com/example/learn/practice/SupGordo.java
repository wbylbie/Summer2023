package com.example.learn.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SupGordo {

  @GetMapping("/lies")
	public String getMessage() {
		return "Surprise is the hood!";
	}


}
