package com.v51das.app.dubbo.server.service.impl;

import com.v51das.app.dubbo.inter.domain.City;
import com.v51das.app.dubbo.inter.domain.User;
import com.v51das.app.dubbo.inter.service.UserDubboService;
import com.v51das.app.dubbo.server.mapper.cluster.CityMapper;
import com.v51das.app.dubbo.server.mapper.master.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *  ⽤户业务实现层
 */
@DubboService(version = "1.0.0")
public class UserDubboServiceImpl implements UserDubboService {

    @Autowired
    private UserMapper userDao; // 主数据源
    @Autowired
    private CityMapper cityDao; // 从数据源

    @Override
    public User findByName(String userName) {
        User user = userDao.findByName(userName);
        City city = cityDao.findByName("温岭市");
        user.setCity(city);
        return user;
    }
}
