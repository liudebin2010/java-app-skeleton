package com.v51das.app.couchbase.reactive.repository;

import com.v51das.app.couchbase.reactive.model.Person;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@ViewIndexed(designDoc = ViewPersonRepository.DESIGN_DOCUMENT)
public interface ViewPersonRepository extends ReactiveCrudRepository<Person, String> {

    String DESIGN_DOCUMENT = "person";

    @View(designDocument = ViewPersonRepository.DESIGN_DOCUMENT)
    Flux<Person> findByFirstName(String firstName);
}