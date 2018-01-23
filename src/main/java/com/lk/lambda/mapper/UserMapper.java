package com.lk.lambda.mapper;

import com.lk.lambda.common.SuperMapper;
import com.lk.lambda.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends SuperMapper<User> {
}
