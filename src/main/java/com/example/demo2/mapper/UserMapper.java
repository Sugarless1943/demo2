package com.example.demo2.mapper;

import com.example.demo2.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findById(int id);
}
