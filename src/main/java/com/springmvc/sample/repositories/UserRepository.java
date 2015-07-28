package com.springmvc.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.sample.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//Find by email method
	
	User findByEmail(String email);
	
}
