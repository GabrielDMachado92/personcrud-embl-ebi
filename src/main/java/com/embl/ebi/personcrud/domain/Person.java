package com.embl.ebi.personcrud.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


/**
 * 
 * @author gabriel.machado
 * Person entity
 *
 */
@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	@Length(min = 3, max = 80, message = "Min 3 and max 80 caracters")
	private String firstName;
	
	@NotBlank
	@Length(min = 3, max = 80, message = "Min 3 and max 80 caracters")
	private String lastName;
	
	@NotNull
	private Integer age;
	
	@NotBlank
	@Length(min = 3, max = 60, message = "Min 3 and max 60 caracters")
	private String favouriteColor;

	public Person () {}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFavouriteColor() {
		return favouriteColor;
	}

	public void setFavouriteColor(String favouriteColor) {
		this.favouriteColor = favouriteColor;
	}
	
}
