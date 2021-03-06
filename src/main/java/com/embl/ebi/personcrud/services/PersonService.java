package com.embl.ebi.personcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.embl.ebi.personcrud.domain.Person;
import com.embl.ebi.personcrud.repositories.PersonRepository;
import com.embl.ebi.personcrud.services.exceptions.ObjectNotFoundException;

/**
 * 
 * @author gabriel.machado
 * Gets the object from resource and do any business or other logic that it need to get it ready to access the database(repository)
 * 
 *
 */
@Service
public class PersonService {

	@Autowired
	private PersonRepository repo;

	public List<Person> findAll() {

		return repo.findAll();
	}
	
	
	public Page<Person> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	
	@Transactional
	public Person insert(Person obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Person find(Integer id) {
		Optional<Person> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Person does not exists! Id: " + id + ", Type: " + Person.class.getName()));
	}

	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}
	
	public Person update(Person obj) {
		Person newObj = find(obj.getId());
		updateData(newObj,obj);
		return repo.save(newObj);
	}
	
	private void updateData(Person newObj, Person obj) {
		newObj.setAge(obj.getAge());
		newObj.setFavouriteColor(obj.getFavouriteColor());
		newObj.setFirstName(obj.getFirstName());
		newObj.setLastName(obj.getLastName());
		
	}

}
