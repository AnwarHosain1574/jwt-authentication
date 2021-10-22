package com.example.Jwt.Authentication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * @Author    Anwar Hosain
 * @Since     Oct 22, 2021
 * @version   1.0.0
 */

@SpringBootApplication
public class JwtAuthenticationApplication {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(JwtAuthenticationApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(JwtAuthenticationApplication.class, args);
		System.out.println("My server Running");
	}

}
