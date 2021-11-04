package com.v51das.app.mongo.reactive.repository;

import com.v51das.app.mongo.reactive.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
}