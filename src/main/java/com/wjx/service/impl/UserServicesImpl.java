package com.wjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjx.mapper.UserMapper;
import com.wjx.pojo.User;
import com.wjx.service.UserServices;


@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserMapper userMapper;
	
	public List<User> queryList() {
		return userMapper.queryList();
	}

}
