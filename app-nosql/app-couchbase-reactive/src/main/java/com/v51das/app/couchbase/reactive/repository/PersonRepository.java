package com.v51das.app.couchbase.reactive.repository;

import com.v51das.app.couchbase.reactive.model.Person;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PersonRepository extends CrudRepository<Person, String> {
    List<Person> findByFirstName(String firstName);

    @Query("SELECT META().id AS __id, META().cas AS  __cas, firtName, lastName, created FROM _default")
    List<Person> findByRoutes(String routeName);
}