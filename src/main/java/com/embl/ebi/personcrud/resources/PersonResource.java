package com.embl.ebi.personcrud.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.embl.ebi.personcrud.domain.Person;

@RestController
@RequestMapping(value = "/people")
public class PersonResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Person> list(){
		Person p1 = new Person();
		p1.setAge(22);
		p1.setFavouriteColor("Blue");
		p1.setFirstName("Gabriel");
		p1.setLastName("Machado");
		
		Person p2 = new Person();
		p2.setAge(30);
		p2.setFavouriteColor("Pink");
		p2.setFirstName("Larissa");
		p2.setLastName("Aoyama");
		
		List<Person> people = new ArrayList<>();
		
		people.add(p1);
		people.add(p2);
		
		return people;
		
	}
}
