package com.springmvc.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.sample.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

	User findByForgotPasswordCode(String forgotPasswordCode);

}
