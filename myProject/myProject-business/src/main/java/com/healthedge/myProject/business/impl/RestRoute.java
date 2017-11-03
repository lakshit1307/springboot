package com.healthedge.myProject.business.impl;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.healthedge.myProject.dto.ThingSearchResults;

@Component
public class RestRoute {

//	@Value("${rest.host}")
//	String host;
//
//	@Value("${rest.port}")
//	String port;
//
//	@Override
//	public void configure() throws Exception {
//		restConfiguration().component("jetty").host(host).port(port).bindingMode(RestBindingMode.json);
//
//		rest("/things").post().type(Thing.class).to("direct:createThing").get("/{id}").outType(Thing.class).to("direct:getThing").delete("/{id}")
//				.outType(Thing.class).to("direct:removeThing");
//		
//		from("direct:createThing")
//		.to("jpa:com.healthedge.myProject.entity.Thing");
//		
//		from("direct:getThing")
//		.to("sql:select * from THING where id = :#${header.id}?dataSource=dataSource&outputType=SelectOne")
//		.beanRef("transformer", "mapThing");
//
//
//	from("direct:removeThing")
//		.to("direct:getThing")
//		.setProperty("thing", body())
//		.to("sql:delete from THING where id = :#${body.id}?dataSource=dataSource")
//		.setBody(property("thing"));
//	
//	from("file:C:\\Users\\laksh\\Documents\\input").process(new MyProcess()).bean(new Transform(),"toUpper").to("file:C:\\Users\\laksh\\Documents\\output");
//	}
}