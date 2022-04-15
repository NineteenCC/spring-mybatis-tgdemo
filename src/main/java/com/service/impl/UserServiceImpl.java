package com.service.impl;

import com.mapper.UserMapper;
import com.model.User;
import com.service.UserService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author chenfan
 * @since 1.0.0 2022/4/13 19:58
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    @Scheduled(cron = "* * * * * *")
    public void insertUserInfo() {
        this.userMapper.insert(new User(123,"zhangsan",23));
        System.out.println("当前时间" + System.currentTimeMillis());
    }
}
