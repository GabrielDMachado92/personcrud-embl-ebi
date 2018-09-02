package com.embl.ebi.personcrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.embl.ebi.personcrud.domain.Person;


/**
 * 
 * @author gabriel.machado
 * 
 * This is for when the first time I run the app it has some data already
 * 
 *
 */
@Service
public class InitiateDbService {

	@Autowired
	PersonService personService;
	
	public void instatiateDatabase() {
		
		Person p1 = new Person();
		
		p1.setAge(22);
		p1.setFavouriteColor("Blue");
		p1.setFirstName("Gabriel");
		p1.setLastName("Machado");
		
		personService.insert(p1);
		
	}
	
}
