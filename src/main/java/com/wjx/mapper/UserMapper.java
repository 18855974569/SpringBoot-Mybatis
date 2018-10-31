package com.wjx.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wjx.pojo.User;

@Repository
public interface UserMapper {

	/**
	 * 一共有两种读取数据库的形式
	 * 1.注解 @Select  @Updata
	 * 2.xml文件
	 * @return
	 */
	
	//注解形式
	/*@Select("select * from users")
	List<User> queryList();*/
	
	//非注解，走xml路线
	List<User> queryList();
}
