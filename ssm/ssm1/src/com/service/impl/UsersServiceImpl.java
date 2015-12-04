package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.UsersMapper;
import com.model.Users;
import com.service.UsersService;


@Service("usersService")
@Transactional  //�Ӵ˲����ٽ��д���SqlSession���ύ���������spring����
public class UsersServiceImpl implements UsersService {
	
	//@Resource
	private UsersMapper mapper;

	@Override
	public List<Users> findAll() {
		List<Users> allUsersList = mapper.findAll();
		
		return allUsersList;
	}

	@Override
	public Users findUserByUserName(int id) {
		
		Users user = mapper.findById(id);
		return user;
	}
	
	
	
	
	public UsersMapper getMapper() {
		return mapper;
	}

	@Autowired
	public void setMapper(UsersMapper mapper) {
		this.mapper = mapper;
	}


}
