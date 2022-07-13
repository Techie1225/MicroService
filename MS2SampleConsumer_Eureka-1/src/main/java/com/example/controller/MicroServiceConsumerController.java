package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceConsumerController {
//	LoadBalancerClient and DiscoveryClient Consuming Method MicroServiceConsumerController.consumingFunction()
	
	/*
	 * @Autowired private DiscoveryClient client;
	 */

	/*
	 * @Autowired private LoadBalancerClient client;
	 * 
	 * public String consumingFunction() {
	 * 
	 * ServiceInstance li=client.choose("MS1");
	 * 
	 * String URL=li.getUri()+"/service/find";
	 * 
	 * RestTemplate template=new RestTemplate(); String
	 * response=template.getForObject(URL, String.class); return response;
	 * 
	 * }
	 */
	@Autowired
	private FeignInterface feign;
	
	@GetMapping("/merging")
	public String MappingFunction() {
		return feign.feignConsumer()+" ..Here we work with loadBalancer,Feing and DiscoveryClient";
	}
}
