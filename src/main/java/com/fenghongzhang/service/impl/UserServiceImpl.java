package com.fenghongzhang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenghongzhang.entity.User;
import com.fenghongzhang.mapper.UserMapper;
import com.fenghongzhang.service.UserService;

/**
 * 服务实现类
 * @author fhz
 *
 */
@Service
public class UserServiceImpl implements UserService{

	//注入mapper
	@Autowired
	private UserMapper userMapper;
	//取到所有用户
	@Override
	public List<User> getAllUsers() {
		List<User> allUsers = userMapper.getAllUsers();
		return allUsers;
	}

	
	
}
