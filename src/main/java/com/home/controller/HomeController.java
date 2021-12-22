package com.home.controller;

import com.home.domain.User;
import com.home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/home/main")
    public String hello(){
        return "main";
    }

    @RequestMapping("/home/list")
    public String list(HttpServletRequest request){
        List<User> list = userService.findALl();
        request.setAttribute("list",list);
        return "main";
    }
}
