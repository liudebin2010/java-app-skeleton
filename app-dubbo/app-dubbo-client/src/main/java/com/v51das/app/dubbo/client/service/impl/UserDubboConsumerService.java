package com.v51das.app.dubbo.client.service.impl;

import com.v51das.app.dubbo.inter.domain.City;
import com.v51das.app.dubbo.inter.domain.User;
import com.v51das.app.dubbo.inter.service.UserDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserDubboConsumerService {

    @DubboReference(version = "1.0.0")
    UserDubboService userDubboService;

    public String printUser() {
        String userName="泥瓦匠";
        User user = userDubboService.findByName(userName);
        return user.toString();
    }
}
