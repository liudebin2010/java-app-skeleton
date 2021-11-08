package com.v51das.app.couchbase.reactive.controller;

import com.v51das.app.couchbase.reactive.model.Person;
import com.v51das.app.couchbase.reactive.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PersonController {

    @Resource
    private PersonService personServiceImpl;

    @PostMapping(path = "/save",consumes = {"application/json"})
    public void savePersion(@RequestBody Person person){
        personServiceImpl.create(person);
    }
}
