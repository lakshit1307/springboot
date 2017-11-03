package com.healthedge.myProject.dao;

import java.util.List;

import com.healthedge.myProject.dto.BaseResponse;
import com.healthedge.myProject.dto.ThingSearchResults;

public interface ThingDao {

	List<ThingSearchResults> getByName(String name);

	BaseResponse saveThing(String name, String owner);

}
