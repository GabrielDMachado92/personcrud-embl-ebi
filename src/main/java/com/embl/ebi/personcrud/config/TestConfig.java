package com.embl.ebi.personcrud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.embl.ebi.personcrud.services.InitiateDbService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	InitiateDbService dbService;
	
	@Bean
	public boolean initiateDb() {
		
		dbService.instatiateDatabase();
		
		return true;
	}
}
