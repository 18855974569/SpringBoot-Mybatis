package com.wjx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wjx.injection.Jdbc;
import com.wjx.pojo.User;
import com.wjx.service.UserServices;

@RestController
public class UserController {

	@Autowired
	private UserServices userServices;
	
	@Autowired
	private Jdbc jdbc;

	@RequestMapping(value = "/query")
	public List<User> queryList() {
		System.out.println(jdbc.getUser());
		return userServices.queryList();
	}
}
