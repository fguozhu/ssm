package com.web.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ssm.dao.UserMapper;
import com.web.ssm.pojo.User;
import com.web.ssm.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
}
