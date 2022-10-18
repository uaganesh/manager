package com.telecom.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.telecom.manager","com.telecom.complaint"})
@EntityScan(basePackages = {"com.telecom.manager.bean","com.telecom.complaint.bean"})

public class RllProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RllProjectApplication.class, args);
		System.out.println("Manager Running");
	}

}
