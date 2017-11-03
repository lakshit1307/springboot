package com.healthedge.myProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthedge.myProject.dao.ThingDao;
import com.healthedge.myProject.dto.BaseResponse;
import com.healthedge.myProject.dto.ThingSearchResults;
import com.healthedge.myProject.service.ThingService;

@Service
public class ThingServiceImpl implements ThingService {

	@Autowired
	private ThingDao thingDao;

	@Override
	public BaseResponse createThing(String name, String owner) {
		return thingDao.saveThing(name, owner);
	}

	@Override
	public List<ThingSearchResults> getByName(String name) {
		return thingDao.getByName(name);
	}
}