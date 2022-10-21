package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
