package com.estar.branchs.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EstarBranchsConfig {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EstarBranchsConfig.class, args);
	}
}
