package com.embl.ebi.personcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.embl.ebi.personcrud.domain.Person;
import com.embl.ebi.personcrud.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repo;
	
	public List<Person> findAll() {
		
		return repo.findAll();
	}
	
	@Transactional
	public Person insert(Person obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Person find(Integer id) {
		Optional<Person> obj = repo.findById(id);
		return obj.get();
	}
	
}
