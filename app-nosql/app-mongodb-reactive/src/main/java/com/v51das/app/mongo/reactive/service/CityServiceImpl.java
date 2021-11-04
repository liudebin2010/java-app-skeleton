package com.v51das.app.mongo.reactive.service;

import com.v51das.app.mongo.reactive.model.City;
import com.v51das.app.mongo.reactive.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService{

    @Autowired
    private CityRepository cityRepository;

    @Override
    public Mono<City> insert(City city) {
        return cityRepository.save(city);
    }

    @Override
    public Flux<City> saveAll(List<City> cities) {
        return cityRepository.saveAll(cities);
    }

    @Override
    public Mono<City> findById(String id) {
        return cityRepository.findById(id);
    }

    @Override
    public Flux<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Mono<Void> deleteAll() {
        return cityRepository.deleteAll();
    }
}
