package com.wjx.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


/**
 * 使用@Value注解获取properties里面的数据
 * @author wjx
 */

@Component
@PropertySource("classpath:jdbc.properties")
public class Jdbc {

	@Value("${jdbc.user}")
	private String user;
	@Value("${jdbc.password}")
	private String password;

	public void speack() {
		System.out.println("username:" + user + "------" + "password:" + password);
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
