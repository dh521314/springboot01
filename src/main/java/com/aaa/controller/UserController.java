package com.aaa.controller;

import com.aaa.entity.Users;
import com.aaa.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/findAll")
    public List<Users> findAll(){
        List<Users> list = userService.selectAll();
        return list;
    }
}
