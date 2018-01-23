package com.lk.lambda.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lk.lambda.mapper.UserMapper;
import com.lk.lambda.model.User;
import com.lk.lambda.service.IUserService;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * User 表数据服务层接口实现类
 *
 */
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


}