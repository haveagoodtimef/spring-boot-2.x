package com.fenghongzhang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fenghongzhang.entity.User;
import com.fenghongzhang.mapper.UserMapper;

/**
 * user服务类
 * @author fhz
 *
 */
public interface UserService {
	
	public List<User> getAllUsers();
	
}
