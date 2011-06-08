package org.opencredo.s2.training.validationbpp;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author tomas.lukosius@opencredo.com
 * 
 */
public class Person {
	@NotEmpty
	@Pattern(regexp = "[A-Z][a-z]+")
	private String name;
	@NotEmpty
	@Pattern(regexp = "[A-Z][a-z]+")
	private String surname;
	@NotEmpty
	@Pattern(regexp = ".+@.+\\.[a-z]+")
	private String email;

	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

}
