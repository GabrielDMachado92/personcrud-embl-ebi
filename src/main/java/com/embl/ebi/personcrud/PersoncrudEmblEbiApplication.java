package com.embl.ebi.personcrud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.embl.ebi.personcrud.domain.Person;
import com.embl.ebi.personcrud.repositories.PersonRepository;

@SpringBootApplication
public class PersoncrudEmblEbiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PersoncrudEmblEbiApplication.class, args);
	}
	
	@Autowired
	PersonRepository personRepository;

	
	@Override
	public void run(String... args) throws Exception {
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
		
		personRepository.saveAll(Arrays.asList(p1,p2));
	}
	
	
}
