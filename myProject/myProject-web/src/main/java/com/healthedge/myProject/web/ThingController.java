package com.healthedge.myProject.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.healthedge.myProject.business.ThingBusiness;
import com.healthedge.myProject.dto.BaseResponse;
import com.healthedge.myProject.dto.response.ThingsResponse;

@Controller
@RequestMapping("/thing")
public class ThingController {

	@Autowired
	private ThingBusiness thingBusiness;

	@RequestMapping(method = RequestMethod.POST, value = "/{name}/{owner}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody BaseResponse createThing(@PathVariable String name, @PathVariable String owner) {
		return thingBusiness.createThing(name, owner);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ThingsResponse getThings(@PathVariable String name) {
		return thingBusiness.getByName(name);
	}
}
