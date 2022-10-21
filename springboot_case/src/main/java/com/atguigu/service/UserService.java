package com.atguigu.service;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Component
public interface UserService {
    List<User> findAll();
}
