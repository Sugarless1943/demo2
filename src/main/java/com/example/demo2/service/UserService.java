package com.example.demo2.service;

import com.example.demo2.entity.User;
import com.example.demo2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(int id) {
        return userMapper.findById(id);
    }
}
