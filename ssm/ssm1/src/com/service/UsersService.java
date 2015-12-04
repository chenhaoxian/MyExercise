package com.service;

import java.util.List;

import com.model.Users;

public interface UsersService {
	
	List<Users> findAll();

	Users findUserByUserName(int id);

}
