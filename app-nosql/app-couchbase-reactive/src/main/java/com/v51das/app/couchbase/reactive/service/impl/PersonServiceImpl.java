package com.v51das.app.couchbase.reactive.service.impl;

import com.v51das.app.couchbase.reactive.model.Person;
import com.v51das.app.couchbase.reactive.repository.PersonRepository;
import com.v51das.app.couchbase.reactive.service.PersonService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Qualifier("personServiceImpl")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repo;

    public Person findOne(String id) {
        return repo.findById(id).get();
    }

    public List<Person> findAll() {
        List<Person> people = new ArrayList<Person>();
        Iterator<Person> it = repo.findAll().iterator();
        while(it.hasNext()) {
            people.add(it.next());
        }
        return people;
    }

    public List<Person> findByFirstName(String firstName) {
        return repo.findByFirstName(firstName);
    }

    public void create(Person person) {
        person.setCreated(DateTime.now());
        repo.save(person);
    }

    public void update(Person person) {
        person.setUpdated(DateTime.now());
        repo.save(person);
    }

    public void delete(Person person) {
        repo.delete(person);
    }
}
