package com.ssk.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
	
	@Autowired
	LimitsConfiguration limitsConfiguration;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
	}
}
