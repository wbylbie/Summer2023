package com.example.learn.practice;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class LoginStuffService {

	    private final LoginStuffRepository loginStuffRepository;

	        public LoginStuffService(LoginStuffRepository loginStuffRepository) {
			        this.loginStuffRepository = loginStuffRepository;
				    }

		    public List<LoginStuff> getAllLoginStuff() {
			            return loginStuffRepository.findAll();
				        }
}

