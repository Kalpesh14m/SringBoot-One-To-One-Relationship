package com.codedictator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codedictator.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {

}
