package com.embl.ebi.personcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.embl.ebi.personcrud.domain.Person;
import com.embl.ebi.personcrud.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repo;
	
	public List<Person> findAll() {
		
		return repo.findAll();
	}
	
}
