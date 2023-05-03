package com.exmaple.Wrestling.Practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupGordo {

	@RequestMapping("/")
	public String getMessage() {
		return "Surprise is the hood!";
	}


}
