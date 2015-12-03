package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.UsersMapper;
import com.model.Users;
import com.service.UsersService;

@Service
@Transactional  //从此不用再进行创建SqlSession和提交事物，都交给spring管理
public class UsersServiceImpl implements UsersService {
	
	@Resource
	private UsersMapper mapper;

	@Override
	public List<Users> findAll() {
		List<Users> allUsersList = mapper.findAll();
		
		return allUsersList;
	}

}
