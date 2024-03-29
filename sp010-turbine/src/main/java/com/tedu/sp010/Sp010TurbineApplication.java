package com.tedu.sp010;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class Sp010TurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp010TurbineApplication.class, args);
	}

}
