package com.v51das.app.geode.controller;

import com.v51das.app.geode.domain.Author;
import com.v51das.app.geode.repository.AuthorRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

@RestController
public class AuthorController {

    @Resource
    private AuthorRepository authorRepository;

    @RequestMapping(value = "/save",method = RequestMethod.POST,consumes = {"application/json"})
    public Author saveAuthor(@RequestBody Author author){
        return authorRepository.save(author);
    }
    @GetMapping("/get")
    public Flux<Author> getAuthor(){
        return reactor.core.publisher.Flux.fromIterable(authorRepository.findAll());
    }
}
