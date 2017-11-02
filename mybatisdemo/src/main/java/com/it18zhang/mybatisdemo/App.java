package com.it18zhang.mybatisdemo;

import com.it18zhang.mybatisdemo.dao.UserDao;
import com.it18zhang.mybatisdemo.domain.User;

/**
 * @author hongXkeX
 * @date 2017/10/31 9:30
 */
public class App {
    public static void main(String[] args) {
        UserDao dao = new UserDao();
        User user = dao.selectOne(1);
        System.out.println(user.getName());
//        System.out.println();
//        List<User> list = dao.selectAll();
//        for (User u : list) {
//            System.out.println(u.getId() + " " + u.getName());
//        }
    }
}
