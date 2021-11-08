package com.v51das.app.couchbase.reactive.service.impl;

import com.v51das.app.couchbase.reactive.model.Person;
import com.v51das.app.couchbase.reactive.service.PersonService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Qualifier("PersonTemplateService")
public class PersonTemplateService implements PersonService {

    @Autowired
    private CouchbaseTemplate template;

    @Override
    public Person findOne(String id) {
        return template.findById(Person.class).one(id);
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public List<Person> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public void create(Person person) {

    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }
//    private static final String DESIGN_DOC = "person";
//    @Autowired
//    private CouchbaseTemplate template;
//
//    public Person findOne(String id) {
//        return template.findById(Person.class).one(id);
//    }
//
//    public List<Person> findAll() {
//        return template.findByQuery().findByView(ViewQuery.from(DESIGN_DOC, "all"), Person.class);
//    }
//
//    public List<Person> findByFirstName(String firstName) {
//        return template.findByView(ViewQuery.from(DESIGN_DOC, "byFirstName"), Person.class);
//    }
//
//    public void create(Person person) {
//        person.setCreated(DateTime.now());
//        template.insert(person);
//    }
//
//    public void update(Person person) {
//        person.setUpdated(DateTime.now());
//        template.upsertById(person.getClass());
//    }
//
//    public void delete(Person person) {
//        template.remove(person);
//    }
}