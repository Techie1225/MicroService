package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Ms2SampleConsumerEureka1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms2SampleConsumerEureka1Application.class, args);
	}

}
