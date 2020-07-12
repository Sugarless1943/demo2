package com.example.demo2.mapper;

import com.example.demo2.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findById(int id);
}
