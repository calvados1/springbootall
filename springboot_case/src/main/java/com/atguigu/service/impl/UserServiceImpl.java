package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService  {
    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.selectAll();
    }

}
