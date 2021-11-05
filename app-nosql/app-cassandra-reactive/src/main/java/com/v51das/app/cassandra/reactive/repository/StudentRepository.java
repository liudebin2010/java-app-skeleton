package com.v51das.app.cassandra.reactive.repository;

import com.v51das.app.cassandra.reactive.model.Student;
import org.springframework.data.cassandra.repository.CassandraRepository;

/**
 * 持久层
 */
public interface StudentRepository extends CassandraRepository<Student,Long> {


}