package com.pk.ms.limits.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.ms.limits.beans.LimitConfiguration;

@RestController
@RequestMapping("/limits-service")
public class LimitsConfigurationController {

	@GetMapping("/limits")
	public LimitConfiguration retreiveLimitsFromConfiguration() {
		return new LimitConfiguration(100, 1000);

	}
}
