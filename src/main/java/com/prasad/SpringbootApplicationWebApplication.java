package com.prasad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@Configuration
public class SpringbootApplicationWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplicationWebApplication.class, args);
	}

}
