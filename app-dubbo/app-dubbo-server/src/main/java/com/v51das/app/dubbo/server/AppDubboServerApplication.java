package com.v51das.app.dubbo.server;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class AppDubboServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppDubboServerApplication.class, args);
    }

}
