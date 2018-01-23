package com.lk.lambda;

import com.lk.lambda.mapper.UserMapper;
import com.lk.lambda.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LambdaApplicationTests {
	@Autowired
	private UserMapper userMapper ;
	@Test
	public void contextLoads() {
	}


	@Test
	public void suerMapperInsertTest(){
		List<User> list  = userMapper.selectList(null);
		for (int i = 0; i < list.size(); i++) {
			User user =  list.get(i);
			System.out.println(user);
		}
	}
}
