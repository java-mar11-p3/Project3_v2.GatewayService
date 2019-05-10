package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * 
 * @author Poho
 * This class is to register API Gateway as client in Eureka so it can hand requests from frontend
 * and filter requests to applicable services on the Eureka server
 *  
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewayService {
	public static void main(String[] args) {
		SpringApplication.run(GatewayService.class, args);
	}
}
