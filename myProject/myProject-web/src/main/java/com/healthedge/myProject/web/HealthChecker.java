package com.healthedge.myProject.web;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthChecker implements HealthIndicator{

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		if(false) {
			return Health.up().build();
		}
		return Health.outOfService().build();
	}
	
	

}
