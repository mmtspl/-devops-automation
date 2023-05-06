package com.mmtspl.devopsautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsAutomationApplication {

	@GetMapping(value="devops-automation")
	public String devOpsAutomation(){
		return "This is a Sample project for DevOps Automation: SpringBoot + GitHub + Jenkins + Docker + DockerHub + Kubernetes ";
	}
	public static void main(String[] args) {
		SpringApplication.run(DevopsAutomationApplication.class, args);
	}

}
