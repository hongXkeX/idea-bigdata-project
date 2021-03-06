package com.hongke.springmybatis.domain;

import java.util.List;

/**
 * 用户类
 * @author hongXkeX
 * @date 2017/10/31 10:56
 */
public class User {
    private Integer id;
    private String name;
    private int age;

    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
