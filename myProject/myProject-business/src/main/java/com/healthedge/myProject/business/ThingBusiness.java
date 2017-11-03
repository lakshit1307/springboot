package com.healthedge.myProject.business;


import com.healthedge.myProject.dto.BaseResponse;
import com.healthedge.myProject.dto.response.ThingsResponse;

public interface ThingBusiness {

	ThingsResponse getByName(String name);

	BaseResponse createThing(String name, String owner);

}
