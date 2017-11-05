package com.hongke.springmybatis.domain;

/**
 * 订单项
 * @author hongXkeX
 * @date 2017/10/31 14:53
 */
public class Item {
    private Integer id;
    private String itemName;
    // 建立订单项和订单之间的关联关系(多个订单项可能同属于一个订单 即是多对一关系）
    private Order order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
