package com.libsgh.service.consumer.service;

import org.springframework.stereotype.Component;

@Component
public class ComputeClientHystrix implements ComputeClient{

	@Override
	public Integer add(Integer a, Integer b) {
		return -9999;
	}

}
