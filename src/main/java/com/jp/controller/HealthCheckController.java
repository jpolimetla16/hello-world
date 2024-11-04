package com.jp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health/check")
public class HealthCheckController {

	@Autowired
	private Environment environment;

	@GetMapping
	public String status() {
		return String.format("It's Working on host:%s", environment.getProperty("hostname"));
	}
	
}
