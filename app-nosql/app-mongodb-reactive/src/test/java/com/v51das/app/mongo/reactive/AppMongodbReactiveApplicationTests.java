package com.v51das.app.mongo.reactive;

import com.v51das.app.mongo.reactive.model.User;
import com.v51das.app.mongo.reactive.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class AppMongodbReactiveApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        // 创建三个User，并验证User总数
        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));
        Assertions.assertEquals(3, userRepository.findAll().size());
        // 删除⼀个User，再验证User总数
        Optional<User> u = userRepository.findById(1L);
        userRepository.delete(u.get());
        Assertions.assertEquals(2, userRepository.findAll().size());
        // 删除⼀个User，再验证User总数
        User us = userRepository.findByUsername("mama");
        userRepository.delete(us);
        Assertions.assertEquals(1, userRepository.findAll().size());
    }
}
