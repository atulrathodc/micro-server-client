package com.example.springbooteurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@RequestMapping("/hello")
	public String helloclient()
	{
		return "HelloMicroService";
		
	}

}
