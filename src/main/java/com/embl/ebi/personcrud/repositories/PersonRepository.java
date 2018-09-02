package com.embl.ebi.personcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.embl.ebi.personcrud.domain.Person;


/**
 * 
 * @author gabriel.machado
 * Person repository, here you can edit queries from Person, if you need you can create another class like this one to new domains
 *
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
