package com.it18zhang.mybatisdemo.domain;

import java.util.List;

/**
 * 订单类
 * @author hongXkeX
 * @date 2017/10/31 14:49
 */
public class Order {
    private Integer id;
    private String orderNo;
    // 建立订单类和用户之间的关联关系(多个订单可能同属于一个用户 所以是多对一的关系）
    private User user;

    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
