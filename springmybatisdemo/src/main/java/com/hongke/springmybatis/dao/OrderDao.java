package com.hongke.springmybatis.dao;

import com.hongke.springmybatis.domain.Order;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * OrderDao
 * @author hongXkeX
 * @date 2017/11/5 10:08
 */
public class OrderDao extends SqlSessionDaoSupport implements BaseDao<Order>{

    public void insert(Order order) {
        getSqlSession().insert("orders.insert", order);
    }

    public void update(Order order) {
        getSqlSession().update("orders.update", order);
    }

    public void delete(Integer id) {
        getSqlSession().delete("orders.delete", id);
    }

    public Order selectOne(Integer id) {
        return getSqlSession().selectOne("orders.selectOne", id);
    }

    public List<Order> selectAll() {
        return getSqlSession().selectList("orders.selectAll");
    }
}
