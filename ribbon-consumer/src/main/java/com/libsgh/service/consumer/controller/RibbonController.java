package com.libsgh.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
	
	@Autowired
	private RestTemplate template;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(){
		return template.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
	}

}
