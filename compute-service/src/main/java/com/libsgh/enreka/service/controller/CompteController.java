package com.libsgh.enreka.service.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompteController {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private DiscoveryClient dc;
	
	@RequestMapping(value="/add", method= {RequestMethod.GET,RequestMethod.GET})
	public Integer add(Integer a, Integer b){
		ServiceInstance si = dc.getLocalServiceInstance();
		Integer  r = a + b;
		logger.info("/add, host:" + si.getHost() + ", service_id:" + si.getServiceId() + ", result:" + r);
		return r;
	}
	 
}
