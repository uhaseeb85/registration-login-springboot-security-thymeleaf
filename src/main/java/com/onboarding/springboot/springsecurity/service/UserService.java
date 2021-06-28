package com.onboarding.springboot.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.onboarding.springboot.springsecurity.model.User;
import com.onboarding.springboot.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
