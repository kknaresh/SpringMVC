package com.springmvc.sample.services;

import org.springframework.validation.BindingResult;

import com.springmvc.sample.dto.ForgotPasswordForm;
import com.springmvc.sample.dto.ResetPasswordForm;
import com.springmvc.sample.dto.SignupForm;
import com.springmvc.sample.dto.UserEditForm;
import com.springmvc.sample.entities.User;

public interface UserService {
	
	public abstract void signup(SignupForm signupForm);

	public abstract void verify(String verificationCode);

	public abstract void forgotPassword(ForgotPasswordForm forgotPasswordForm);

	public abstract void resetPassword(String forgotPasswordCode,
			ResetPasswordForm resetPasswordForm, BindingResult result);

	public abstract User findOne(long userId);

	public abstract void update(long userId, UserEditForm userEditForm);
}
