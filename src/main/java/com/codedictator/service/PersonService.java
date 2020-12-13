package com.codedictator.service;

import com.codedictator.model.Person;

public interface PersonService {
	public void savePerson(Person person);

	public Person getPerson(Long personId);
}
