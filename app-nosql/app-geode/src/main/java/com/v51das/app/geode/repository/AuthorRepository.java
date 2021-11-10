package com.v51das.app.geode.repository;

import com.v51das.app.geode.domain.Author;
import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}