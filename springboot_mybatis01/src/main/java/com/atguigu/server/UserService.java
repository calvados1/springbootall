package com.atguigu.server;

import com.atguigu.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
