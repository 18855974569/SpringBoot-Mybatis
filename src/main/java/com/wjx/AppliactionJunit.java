package com.wjx;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wjx.pojo.User;
import com.wjx.service.UserServices;

/**
 * SpringBoot Junit4测试
 * @author wjx
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AppliactionJunit {

	@Autowired
	private UserServices userServices;

	@Test
	public void test() {
		List<User> list = userServices.queryList();
		System.out.println("集合长度:" + list.size());
	}

}
