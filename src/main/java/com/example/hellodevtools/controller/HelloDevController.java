package com.example.hellodevtools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloDevController {
	
	@GetMapping("/dev")
	public String helloDev() {
		return "hello_dev";
	}
}
