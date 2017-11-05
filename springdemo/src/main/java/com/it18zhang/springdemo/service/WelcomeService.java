package com.it18zhang.springdemo.service;

import com.it18zhang.springdemo.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hongXkeX
 * @date 2017/11/2 9:45
 */
@Service("ws")
public class WelcomeService {
    private String message = "hello world";
    private UserDao dao;

    @Resource(name = "userDao")
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
        dao.insert();
    }
}
