package com.v51das.app.dubbo.client.controller;

import com.v51das.app.dubbo.client.service.impl.CityDubboConsumerService;
import com.v51das.app.dubbo.client.service.impl.UserDubboConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserConsumerController {

    @Resource
    private UserDubboConsumerService userDubboConsumerService;

    @RequestMapping("/user")
    public String getStr(){
        return userDubboConsumerService.printUser();
    }
}
