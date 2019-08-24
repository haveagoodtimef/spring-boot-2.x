package com.fenghongzhang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fenghongzhang.entity.User;

/**
 * mapper 记得加上
 * 数据库
 * @author fhz
 *
 */

@Mapper
public interface UserMapper {
	
	public List<User> getAllUsers();
	
}
