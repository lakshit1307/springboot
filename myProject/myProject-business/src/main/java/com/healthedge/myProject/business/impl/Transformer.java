package com.healthedge.myProject.business.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.healthedge.myProject.dto.ThingSearchResults;

@Component("transformer")
public class Transformer {
//	public Thing mapThing(Map<String,Object> map) {
//		Thing thing=new Thing();
//		thing.id=(Integer) map.get("id");
//		thing.name=(String) map.get("name");
//		thing.owner=(String) map.get("owner");
//		return thing;
//	}
//
//	public String constructQuery(Map<String,Object> map) {
//		String where=null;
//		if (map.get("name")!=null) {
//			where="name = :#" + (String) map.get("name");
//		}
//
//		String query= "select * from THING";
//		if (where!=null) {
//			query += " where " + where;
//		}
//		return query;
//	}	
}