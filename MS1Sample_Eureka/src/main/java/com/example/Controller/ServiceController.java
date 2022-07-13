package com.example.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {
	@Value("${server.port}")
	private int Port;
	@Value("${eureka.instance.instance-id}")
	private String InstanceID;

@GetMapping("/find")
	public String SearchFunction() {
		return "PortNo : "+Port+"Instance : "+InstanceID+"Welcome to MicroService";
	}

}
