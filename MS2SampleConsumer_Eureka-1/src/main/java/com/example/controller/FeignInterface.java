package com.example.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MS1")
public interface FeignInterface {

	@GetMapping("/service/find")
	public String feignConsumer() ;
}
