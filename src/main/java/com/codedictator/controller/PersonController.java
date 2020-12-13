package com.codedictator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedictator.model.Person;
import com.codedictator.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping("/getBuId/{personId}")
	public Person fetchPerson(@PathVariable("personId") Long personId) {
		return personService.getPerson(personId);
	}

	@PostMapping("/save")
	public void savePerson(@RequestBody Person person) {
		personService.savePerson(person);
	}
}
