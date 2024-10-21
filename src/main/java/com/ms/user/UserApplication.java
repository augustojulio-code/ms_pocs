package com.ms.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ms.user.utils.EnvLoader;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		EnvLoader.loadEnv();
		SpringApplication.run(UserApplication.class, args);
	}

}
