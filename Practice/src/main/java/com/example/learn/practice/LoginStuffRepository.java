package com.example.learn.practice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginStuffRepository extends JpaRepository<LoginStuff, Long> {
	     }

