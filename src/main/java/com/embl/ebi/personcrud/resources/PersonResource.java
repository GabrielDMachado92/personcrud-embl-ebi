package com.embl.ebi.personcrud.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.embl.ebi.personcrud.domain.Person;
import com.embl.ebi.personcrud.services.PersonService;

@RestController
@RequestMapping(value = "/people")
public class PersonResource {
	
	
	@Autowired 
	PersonService personService;

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Person>> list(){
		
		List<Person> list = personService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}
