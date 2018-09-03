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
		
		p1.setAge(32);
		p1.setFavouriteColor("Green");
		p1.setFirstName("Joao");
		p1.setLastName("Silva");
		
		Person p2 = new Person();
		
		p2.setAge(22);
		p2.setFavouriteColor("Blue");
		p2.setFirstName("Gabriel");
		p2.setLastName("Machado");
		
		Person p3 = new Person();
		
		p3.setAge(40);
		p3.setFavouriteColor("Yellow");
		p3.setFirstName("Bernard");
		p3.setLastName("Cool");
		
		Person p4 = new Person();
		p4.setAge(35);
		p4.setFavouriteColor("Purple");
		p4.setFirstName("Happy");
		p4.setLastName("John");
		
		Person p5 = new Person();
		
		p5.setAge(50);
		p5.setFavouriteColor("Black");
		p5.setFirstName("Mathew");
		p5.setLastName("Pirahy");
		
		personService.insert(p1);
		personService.insert(p2);
		personService.insert(p3);
		personService.insert(p4);
		personService.insert(p5);
		
	}
	
}
