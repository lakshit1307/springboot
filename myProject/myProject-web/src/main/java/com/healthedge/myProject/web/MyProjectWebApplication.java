package com.healthedge.myProject.web;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.healthedge.myProject.business.impl.RestRoute;

@SpringBootApplication
@ComponentScan(basePackages = "com.healthedge.*")
@EntityScan( basePackages = "com.healthedge.myProject.persistence.entity" )
@EnableJpaRepositories("com.healthedge.myProject.persistence.repository")
@EnableAutoConfiguration
public class MyProjectWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectWebApplication.class, args);
	}
}
