package com.healthedge.myProject.dto.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.healthedge.myProject.dto.BaseResponse;
import com.healthedge.myProject.dto.ThingSearchResults;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ThingsResponse extends BaseResponse {

	private List<ThingSearchResults> results;

	public List<ThingSearchResults> getResults() {
		return results;
	}

	public void setResults(List<ThingSearchResults> results) {
		this.results = results;
	}

}
