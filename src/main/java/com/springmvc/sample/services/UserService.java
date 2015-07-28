package com.springmvc.sample.services;

import com.springmvc.sample.dto.SignupForm;

public interface UserService {
	
	public abstract void signup(SignupForm signupForm);

	public abstract void verify(String verificationCode);
	
}
