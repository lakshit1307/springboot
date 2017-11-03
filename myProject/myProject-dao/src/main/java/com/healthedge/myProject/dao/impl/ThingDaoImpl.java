package com.healthedge.myProject.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthedge.myProject.dao.ThingDao;
import com.healthedge.myProject.dto.BaseResponse;
import com.healthedge.myProject.dto.ThingSearchResults;
import com.healthedge.myProject.persistence.entity.Thing;
import com.healthedge.myProject.persistence.repository.ThingRepository;

@Service
public class ThingDaoImpl implements ThingDao {

	@Autowired
	private ThingRepository thingRepository;

	@Override
	public List<ThingSearchResults> getByName(String name) {
		List<Thing> things = thingRepository.getThingByName(name);
		List<ThingSearchResults> thingResults = new ArrayList<ThingSearchResults>();
		for (Thing thing : things) {
			ThingSearchResults thingSearchResults = new ThingSearchResults();
			thingSearchResults.setName(thing.getName());
			thingSearchResults.setOwner(thing.getOwner());
			thingResults.add(thingSearchResults);
		}
		return thingResults;
	}

	@Override
	public BaseResponse saveThing(String name, String owner) {
		BaseResponse response=new BaseResponse();
		try {
			Thing thing=new Thing();
			thing.setName(name);
			thing.setOwner(owner);;
			thingRepository.save(thing);
			response.setStatus("SUCCESS");;
		}
		catch( Exception e) {
			System.out.println(e);
			response.setMessage(e.getMessage());
			response.setStatus("FAILURE");
		}
		return response;
	}

}
