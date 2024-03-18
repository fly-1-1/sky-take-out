package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {

    /**
     * wx登录
     *
     * @param userLoginDTO 用户登录dto
     * @return {@link User}
     */
    User wxLogin(UserLoginDTO userLoginDTO);

}
