package com.embl.ebi.personcrud.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.embl.ebi.personcrud.domain.Person;
import com.embl.ebi.personcrud.services.PersonService;
/**
 * 
 * @author gabriel.machado
 * Rest endpoint, please use this just as an endpoint from rest, do not code any business logic here, use the service
 * 
 * If you need, you can create a DTO object to talk as the endpoint, didn't do that here, because it was not necessary for this scope yet
 *
 */
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
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Person obj) {
		
		obj = personService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Person> find(@PathVariable Integer id) {

		Person obj = personService.find(id);
		return ResponseEntity.ok().body(obj);

	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {

		personService.delete(id);
		return ResponseEntity.noContent().build();

	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Person obj, @PathVariable Integer id){
		obj.setId(id);
		obj = personService.update(obj);
		return ResponseEntity.noContent().build();
	}
	
}
