package com.home;

import com.home.domain.User;
import com.home.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    UserService userService;

    @Test
    public void test(){
        List<User> users = userService.findALl();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
