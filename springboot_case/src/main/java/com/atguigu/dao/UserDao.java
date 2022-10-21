package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface UserDao extends Mapper<User> {

}
