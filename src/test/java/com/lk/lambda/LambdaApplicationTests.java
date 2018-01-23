package com.lk.lambda;

import com.lk.lambda.model.User;
import com.lk.lambda.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@Import(LambdaApplication.class)
public class LambdaApplicationTests {
	@Autowired
	private UserService userService ;
	@Test
	public void contextLoads() {
	}


	@Test
	public void userServiceInsertTest(){
		List<User> list  = userService.selectList();
		for (int i = 0; i < list.size(); i++) {
			User user =  list.get(i);
			System.out.println(user);
		}
	}
}
