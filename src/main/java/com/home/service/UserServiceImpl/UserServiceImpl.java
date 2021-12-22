package com.home.service.UserServiceImpl;

import com.home.dao.UserMapper;
import com.home.domain.User;
import com.home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findALl() {
        return userMapper.findAll();
    }
}
