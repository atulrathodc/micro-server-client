package com.example.springbooteurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbooteurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbooteurekaclientApplication.class, args);
	}

}
