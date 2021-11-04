package com.v51das.app.mongo.reactive.clr;

import com.v51das.app.mongo.reactive.model.City;
import com.v51das.app.mongo.reactive.service.CityServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private CityServiceImpl cityServiceImpl;

    @Override
    public void run(String... args) throws Exception {

        logger.info("Creating cities");

        var cities = List.of(
                new City("Bratislava", 432000),
                new City("Budapest", 1759000),
                new City("Prague", 1280000),
                new City("Warsaw", 1748000));

        Mono<Void> one = cityServiceImpl.deleteAll();

        Flux<City> two = cityServiceImpl.saveAll(cities);
        Flux<City> three = cityServiceImpl.findAll();
        three.subscribe(city -> logger.info("{}", city));

        Mono<Void> all = Mono.when(one, two, three);
        all.block();
    }
}