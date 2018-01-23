package com.lk.lambda.service;

import com.lk.lambda.mapper.UserMapper;
import com.lk.lambda.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> selectList() {
      return   userMapper.selectAll();
    }

    public Integer inserUser(User user) {
        return userMapper.insert(user);
    }
}
