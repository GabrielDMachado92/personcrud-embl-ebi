package com.embl.ebi.personcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.embl.ebi.personcrud.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
