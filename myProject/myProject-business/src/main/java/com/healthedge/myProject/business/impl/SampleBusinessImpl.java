package com.healthedge.myProject.business.impl;


import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Component;

import com.healthedge.myProject.business.SampleBusiness;
import com.healthedge.myProject.dto.BaseResponse;

@Component
public class SampleBusinessImpl implements SampleBusiness {
	
//	private final CounterService counterService;

//    @Autowired
//    public SampleBusinessImpl(CounterService counterService) {
//        this.counterService = counterService;
//    }	
	@Override
	public BaseResponse f1() {
		BaseResponse response=new BaseResponse();
		response.setStatus("SUCCESS");
//		counterService.increment("counter.get_greeting");
		return response;
	}
	
	@Override
	public BaseResponse f2() {
		BaseResponse response=new BaseResponse();
		response.setStatus("FAILURE");
		return response;
	}
	
	@Override
	public String OpenCpntext() {
//		RestRoute restRoute=new RestRoute();
//		CamelContext context= new DefaultCamelContext();
//		try {
//			context.addRoutes(restRoute);
//			context.start();
//			Thread.sleep(5*60*1000);
//			context.stop();
//			return "SUCESS";
//		}
//		catch(Exception e) {
//			return "FAILURE";
//			
//		}
		return null;
	}

}
