package com.v51das.app.redis;

import com.v51das.app.redis.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ReactiveHashOperations;
import org.springframework.data.redis.core.ReactiveStringRedisTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import reactor.core.publisher.Mono;

@SpringBootTest
class AppRedisApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void test() throws Exception {
        // 保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "111");
        Assertions.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testObj() throws Exception {
        // 保存对象
        User user = new User("超⼈", 20);
        redisTemplate.opsForValue().set(user.getUsername(), user);
        user = new User("蝙蝠侠", 30);
        redisTemplate.opsForValue().set(user.getUsername(), user);
        user = new User("蜘蛛侠", 40);
        redisTemplate.opsForValue().set(user.getUsername(), user);
        Assertions.assertEquals(20, ((User)redisTemplate.opsForValue().get("超⼈")).getAge().longValue());
        Assertions.assertEquals(30, ((User)redisTemplate.opsForValue().get("蝙蝠侠")).getAge().longValue());
        Assertions.assertEquals(40, ((User)redisTemplate.opsForValue().get("蜘蛛侠")).getAge().longValue());
    }

    @Autowired
    private ReactiveStringRedisTemplate reactiveStringRedisTemplate;

    @Test
    public void testReactive() throws Exception {
        ReactiveHashOperations<String, String, String> hashOps = reactiveStringRedisTemplate.opsForHash();
        Mono mono1 = hashOps.put("apple", "x", "6000");
        mono1.subscribe(System.out::println);
        Mono mono2 = hashOps.put("apple", "xr", "5000");
        mono2.subscribe(System.out::println);
        Mono mono3 = hashOps.put("apple", "xs max", "8000");
        mono3.subscribe(System.out::println);
        Mono<String> sdf=hashOps.get("apple","x");
        sdf.subscribe(System.out::println);
    }


}
