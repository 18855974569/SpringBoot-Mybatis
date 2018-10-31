package com.wjx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.wjx.**.mapper") // 扫描mapper.xml文件
@SpringBootApplication // Springboot的启动程序
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
