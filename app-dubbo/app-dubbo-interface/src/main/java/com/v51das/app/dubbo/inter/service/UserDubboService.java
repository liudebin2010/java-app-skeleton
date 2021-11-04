package com.v51das.app.dubbo.inter.service;

import com.v51das.app.dubbo.inter.domain.User;

public interface UserDubboService  {
    User findByName(String userName);
}
