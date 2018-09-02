package com.embl.ebi.personcrud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.embl.ebi.personcrud.services.InitiateDbService;

/**
 * 
 * @author gabriel.machado
 * test env with mysql
 * 
 *
 */

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	InitiateDbService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean initiateDb() {
		if("create".equalsIgnoreCase(strategy)) {
			dbService.instatiateDatabase();
		}
		
		return true;
	}
}
