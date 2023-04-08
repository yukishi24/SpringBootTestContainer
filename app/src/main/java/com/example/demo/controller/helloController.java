package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class helloController {
	public String getHello() {
		return "/index";
	}
}
