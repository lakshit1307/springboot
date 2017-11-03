package com.healthedge.myProject.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.healthedge.myProject.business.ThingBusiness;
import com.healthedge.myProject.dto.BaseResponse;
import com.healthedge.myProject.dto.ThingSearchResults;
import com.healthedge.myProject.dto.response.ThingsResponse;
import com.healthedge.myProject.service.ThingService;

@Component
public class ThingBusinessImpl implements ThingBusiness {

	@Autowired
	private ThingService thingService;

	@Override
	public BaseResponse createThing(String name, String owner) {
		return thingService.createThing(name, owner);
	}

	@Override
	public ThingsResponse getByName(String name) {
		ThingsResponse results = new ThingsResponse();
		try {
		results.setResults(thingService.getByName(name));
		results.setStatus("SUCCESS");
		}
		catch(Exception e) {
			System.out.println(e);
			results.setMessage(e.getMessage());
			results.setStatus("FAILURE");
		}
		return results;
	}
}
