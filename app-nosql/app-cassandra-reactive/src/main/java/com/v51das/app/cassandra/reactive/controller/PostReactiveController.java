package com.v51das.app.cassandra.reactive.controller;

import com.v51das.app.cassandra.reactive.model.Post;
import com.v51das.app.cassandra.reactive.repository.PostReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.net.URI;
import java.util.UUID;

@RestController
public class PostReactiveController {

    @Autowired
    private PostReactiveRepository postReactiveRepository;

    @GetMapping("/posts")
    public Flux<Post> all() {
        Flux<Post> postFlux = this.postReactiveRepository.findAll();
        return postFlux;
    }

    @PostMapping("/posts")
    public Mono<ServerResponse> create(ServerRequest req) {
        return req.bodyToMono(Post.class)
                .flatMap(post -> this.postReactiveRepository.save(post))
                .flatMap(p -> ServerResponse.created(URI.create("/posts/" + p.getId())).build());
    }

    @GetMapping("/posts/{id}")
    public Mono<ServerResponse> get(@PathVariable String id) {
        return this.postReactiveRepository.findById(UUID.fromString(id))
                .flatMap(post -> ServerResponse.ok().body(Mono.just(post), Post.class))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    @PutMapping("/posts/{id}")
    public Mono<ServerResponse> update(ServerRequest req) {

        return Mono
                .zip(
                        (data) -> {
                            Post p = (Post) data[0];
                            Post p2 = (Post) data[1];
                            p.setTitle(p2.getTitle());
                            p.setContent(p2.getContent());
                            return p;
                        },
                        this.postReactiveRepository.findById(UUID.fromString(req.pathVariable("id"))),
                        req.bodyToMono(Post.class)
                )
                .cast(Post.class)
                .flatMap(post -> this.postReactiveRepository.save(post))
                .flatMap(post -> ServerResponse.noContent().build());

    }

    @DeleteMapping("/posts/{id}")
    public Mono<ServerResponse> delete(ServerRequest req) {
        return ServerResponse.noContent().build(this.postReactiveRepository.deleteById(UUID.fromString(req.pathVariable("id"))));
    }


}
