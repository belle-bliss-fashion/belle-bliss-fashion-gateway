package com.belle_bliss_fashions_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BelleBlissFashionsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelleBlissFashionsGatewayApplication.class, args);
	}

}
