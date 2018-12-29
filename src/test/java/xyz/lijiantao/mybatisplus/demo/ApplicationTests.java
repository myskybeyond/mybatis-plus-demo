package xyz.lijiantao.mybatisplus.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.lijiantao.mybatisplus.demo.mapper.UserMapper;
import xyz.lijiantao.mybatisplus.demo.model.User;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
    private UserMapper userMapper;

	@Test
	public void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
	}

}

