package com.it18zhang.springdemo.dao;

import org.springframework.stereotype.Repository;

/**
 * Dao
 * @author hongXkeX
 * @date 2017/11/2 21:39
 */
@Repository("userDao")
public class UserDao {
    public void insert() {
        System.out.println("insert over!");
    }
}
