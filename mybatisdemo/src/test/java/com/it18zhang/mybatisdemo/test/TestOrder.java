package com.it18zhang.mybatisdemo.test;

import com.it18zhang.mybatisdemo.domain.Order;
import com.it18zhang.mybatisdemo.domain.User;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author hongXkeX
 * @date 2017/10/31 13:13
 */
public class TestOrder {

    @Test
    public void insert() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        User user = new User();
        user.setId(2);
        Order order = new Order();
        order.setOrderNo("No005");
        order.setUser(user);
        s.insert("orders.insert", order);
        s.commit();
        s.close();
    }

    @Test
    public void selectOne() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        Order order = s.selectOne("orders.selectOne",1);
        System.out.println(order.getId()+" "+order.getOrderNo()+" "+" "+order.getUser().getId()+" "+order.getUser().getName());
        s.commit();
        s.close();
    }

    @Test
    public void selectAll() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        List<Order> orders = s.selectList("orders.selectAll");
        for (Order order : orders) {
            System.out.println(order.getId()+" "+order.getOrderNo()+" "+" "+order.getUser().getId()+" "+order.getUser().getName());
        }
        s.commit();
        s.close();
    }
}
