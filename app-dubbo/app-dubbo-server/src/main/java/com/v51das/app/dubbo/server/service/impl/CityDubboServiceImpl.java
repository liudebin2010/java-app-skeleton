package com.v51das.app.dubbo.server.service.impl;

import com.v51das.app.dubbo.inter.domain.City;
import com.v51das.app.dubbo.inter.service.CityDubboService;
import com.v51das.app.dubbo.server.mapper.cluster.CityMapper;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 */
@DubboService(version = "1.0.0")// 注册为 Dubbo 服务
public class CityDubboServiceImpl implements CityDubboService {

    @Resource
    private CityMapper cityMapper;

    public City findCityByName(String cityName) {
        City city=cityMapper.findByName("温岭市");
        return city;
    }

}