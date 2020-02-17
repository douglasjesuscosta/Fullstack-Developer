package com.ecommerceproject.service.frete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableDiscoveryClient
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FreteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreteServiceApplication.class, args);
	}

}
