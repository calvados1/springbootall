package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    List<User> findAll();
}
