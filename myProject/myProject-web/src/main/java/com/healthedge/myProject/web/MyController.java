package com.healthedge.myProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.healthedge.myProject.business.SampleBusiness;
import com.healthedge.myProject.dto.BaseResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@Controller
public class MyController {
	
	@Autowired
	private SampleBusiness sampleBusiness;
	
	@RequestMapping(method = RequestMethod.GET, value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody BaseResponse helloWorld() {
		BaseResponse response=sampleBusiness.f1();
//		response.setMessage(sampleBusiness.OpenCpntext());
		return response;
	}
}
