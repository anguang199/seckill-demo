package com.example.wxtest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WxTest01Application {

	public static void main(String[] args) {
		SpringApplication.run(WxTest01Application.class, args);
	}

}
