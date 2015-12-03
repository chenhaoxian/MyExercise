package com.mapper;

import java.util.List;

import com.model.Users;

/**
 * 
 * @author CHENHY
 *  dao ½Ó¿Ú
 */
public interface UsersMapper {
	void save(Users users);
	boolean update(Users users);
	boolean delete(int id);
	Users findById(int id);
	List<Users> findAll();
	
}
