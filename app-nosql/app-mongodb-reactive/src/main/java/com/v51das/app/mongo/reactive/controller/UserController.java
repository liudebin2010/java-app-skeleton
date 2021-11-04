package com.v51das.app.mongo.reactive.controller;

import com.v51das.app.mongo.reactive.model.User;
import com.v51das.app.mongo.reactive.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * 根据id查询
     * @param id
     * @return

    @GetMapping(value="/{id}")
    public User readUserById(@PathVariable("id") String id){
        return userRepository.findOne(id).get();
    }*/

}
