package com.v51das.app.dubbo.client;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@EnableDubbo
@SpringBootApplication
public class AppDubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppDubboClientApplication.class, args);
    }

}
