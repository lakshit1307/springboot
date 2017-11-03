package com.healthedge.myProject.service;

import java.util.List;

import com.healthedge.myProject.dto.BaseResponse;
import com.healthedge.myProject.dto.ThingSearchResults;

public interface ThingService {

	BaseResponse createThing(String name, String owner);

	List<ThingSearchResults> getByName(String name);

}
