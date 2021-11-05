package com.v51das.app.cassandra.reactive.repository;

import com.v51das.app.cassandra.reactive.model.Post;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import java.util.UUID;

public interface PostReactiveRepository extends ReactiveCassandraRepository<Post, UUID> {
}