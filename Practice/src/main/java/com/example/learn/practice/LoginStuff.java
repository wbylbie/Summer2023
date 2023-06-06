package com.example.learn.practice;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;


@Entity
@Table(name = "LoginStuff")
public class LoginStuff {

	    @Id
	        @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;

	        @Column(name = "username")
		    private String username;

		    @Column(name = "password")
		        private String password;

			         }

