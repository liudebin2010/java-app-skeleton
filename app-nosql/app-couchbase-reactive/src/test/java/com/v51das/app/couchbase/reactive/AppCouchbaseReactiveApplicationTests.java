package com.v51das.app.couchbase.reactive;

import com.v51das.app.couchbase.reactive.model.Person;
import com.v51das.app.couchbase.reactive.repository.ViewPersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import javax.annotation.Resource;
import java.util.UUID;

@SpringBootTest
class AppCouchbaseReactiveApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private ViewPersonRepository viewPersonRepository;

    @Test
    public void shouldSavePerson_findById_thenDeleteIt() {
        String id=3+"";
        final Person person = new Person(id, "John");
        viewPersonRepository
                .save(person)
                .subscribe();

        final Mono<Person> byId = viewPersonRepository.findById(id);

        StepVerifier
                .create(byId)
                .expectNextMatches(result -> result
                        .getId()
                        .equals(id))
                .expectComplete()
                .verify();

        viewPersonRepository
                .delete(person)
                .subscribe();
    }
}
