package com.codedictator.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedictator.model.Person;
import com.codedictator.repository.PersonRepo;

@Service
public class PersonServiceProvider implements PersonService {

	@Autowired
	private PersonRepo personRepo;

	@Override
	public void savePerson(Person person) {
		personRepo.save(person);
	}

	@Override
	public Person getPerson(Long personId) {
		Optional<Person> person = personRepo.findById(personId);
		if (person.isPresent())
			return person.get();
		return null;
	}

}
