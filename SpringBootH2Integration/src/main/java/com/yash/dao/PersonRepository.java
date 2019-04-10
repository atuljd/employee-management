package com.yash.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
