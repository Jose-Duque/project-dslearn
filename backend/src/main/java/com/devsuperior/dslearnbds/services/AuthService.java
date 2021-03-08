package com.devsuperior.dslearnbds.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.repositories.UserRepository;
import com.devsuperior.dslearnbds.services.exceptions.ForbiddenExeption;
import com.devsuperior.dslearnbds.services.exceptions.UnauthorizedExeption;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepositorie;
	
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepositorie.findByEmail(username);
		}
		catch(Exception e) {
			throw new UnauthorizedExeption("Invalid user");
		}
	}
	
	public void validateSelfOrAdmin(Long userId) {
		User user = authenticated();
		if(!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")) {
			throw new ForbiddenExeption("Access denied");
		}
	}
}
