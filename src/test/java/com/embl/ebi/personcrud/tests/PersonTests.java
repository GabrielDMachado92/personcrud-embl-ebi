package com.embl.ebi.personcrud.tests;

import org.junit.Before;
import org.junit.Test;

import com.embl.ebi.personcrud.domain.Person;
import com.embl.ebi.personcrud.services.PersonService;

public class PersonTests {

	
	@Test
	public void personIsInserted() {
		
		
		Person p1 = new Person();
		p1.setAge(22);
		p1.setFavouriteColor("Blue");
		p1.setFirstName("Gabriel");
		p1.setLastName("Machado");
		
		
	}
}
