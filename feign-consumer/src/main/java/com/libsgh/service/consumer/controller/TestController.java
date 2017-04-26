package com.libsgh.service.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class TestController {
	@Value("${eureka.client.serviceUrl.defaultZone}")
    private String serviceUrl;
	
	
	@RequestMapping("/url")
	public String url(){
		return this.serviceUrl;
	}
}
