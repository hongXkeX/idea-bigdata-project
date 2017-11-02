package com.it18zhang.springdemo;

import com.it18zhang.springdemo.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hongXkeX
 * @date 2017/11/2 9:46
 */
public class App {
    public static void main(String[] args) {
        // 创建容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        WelcomeService ws = (WelcomeService)ac.getBean("ws");
        ws.sayHello();
    }
}
