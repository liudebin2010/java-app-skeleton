package com.v51das.app.couchbase.reactive.service;

import com.v51das.app.couchbase.reactive.model.Person;

import java.util.List;

public interface PersonService {
    Person findOne(String id);
    List<Person> findAll();
    List<Person> findByFirstName(String firstName);

    void create(Person person);
    void update(Person person);
    void delete(Person person);
}