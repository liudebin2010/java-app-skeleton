package com.v51das.app.mongo.reactive.repository;

import com.v51das.app.mongo.reactive.model.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CityRepository extends ReactiveMongoRepository<City, String> {
}