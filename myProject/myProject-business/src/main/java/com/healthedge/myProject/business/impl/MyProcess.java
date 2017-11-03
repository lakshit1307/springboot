package com.healthedge.myProject.business.impl;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcess implements Processor{
	
	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Processing: " + exchange.getIn().getBody(String.class));
	}

}
