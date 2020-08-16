package com.aaa.service;

import com.aaa.dao.UserDao;
import com.aaa.entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserDao userDao;

    public List<Users> selectAll(){
        return userDao.selectAll();
    }
}
