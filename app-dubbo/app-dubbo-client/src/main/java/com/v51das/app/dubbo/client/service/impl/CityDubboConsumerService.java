package com.v51das.app.dubbo.client.service.impl;

import com.v51das.app.dubbo.inter.domain.City;
import com.v51das.app.dubbo.inter.service.CityDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * 城市 Dubbo 服务消费者
 *
 */
@Service
public class CityDubboConsumerService {

    @DubboReference(version = "1.0.0")
    CityDubboService cityDubboService;

    public String printCity() {
        String cityName="温岭";
        City city = cityDubboService.findCityByName(cityName);
        return city.toString();
    }
}