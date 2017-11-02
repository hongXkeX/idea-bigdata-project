package com.it18zhang.springdemo.service;

/**
 * @author hongXkeX
 * @date 2017/11/2 9:45
 */
public class WelcomeService {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
    }
}
