package org.cap.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
@RefreshScope
public class RestAssignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestAssignment1Application.class, args);
	}
	@LoadBalanced

	@Bean
	public RestTemplate getRestTemplate()
	{
		RestTemplate restTemplate =new RestTemplate();
		return restTemplate;
	}
}
