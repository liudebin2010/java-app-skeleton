package com.v51das.app.dubbo.server.mapper.master;

import com.v51das.app.dubbo.inter.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 根据用户名获取用户信息
     * @param userName
     * @return
     */
    User findByName(String userName);
}
