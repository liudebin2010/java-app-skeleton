package com.v51das.app.dubbo.client.controller;

import com.v51das.app.dubbo.client.service.impl.CityDubboConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class CityConsumerController {
    @Resource
    private CityDubboConsumerService cityDubboConsumerService;

    @RequestMapping("/city")
    public String getStr(){
        return cityDubboConsumerService.printCity();
    }
}
