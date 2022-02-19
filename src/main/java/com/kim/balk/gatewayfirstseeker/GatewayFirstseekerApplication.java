package com.kim.balk.gatewayfirstseeker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class GatewayFirstseekerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayFirstseekerApplication.class, args);
	}
	
	@GetMapping
	public String welcome(@RequestHeader("x-location") String location){
		return "Welcome to Kaminis first gateway seeker page from "+location;
	}

}
