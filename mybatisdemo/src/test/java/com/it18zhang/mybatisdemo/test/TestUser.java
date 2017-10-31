package com.it18zhang.mybatisdemo.test;

import com.it18zhang.mybatisdemo.domain.Order;
import com.it18zhang.mybatisdemo.domain.User;
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
public class TestUser {

    /**
     * insert
     * @throws Exception
     */
    @Test
    public void insert() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        User user = new User();
        user.setName("hong");
        user.setAge(25);
        s.insert("users.insert", user);
        s.commit();
        s.close();
    }

    /**
     * insertId
     * @throws Exception
     */
    @Test
    public void insertId() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        User user = new User();
        user.setId(12);
        user.setName("jerry12");
        user.setAge(12);
        s.insert("users.insertId", user);
        s.commit();
        s.close();
    }

    /**
     * update
     * @throws Exception
     */
    @Test
    public void update() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        User user = new User();
        user.setId(1);
        user.setAge(21);
        user.setName("tom21");
        s.update("users.update", user);
        s.commit();
        s.close();
    }

    /**
     * selectOne
     * @throws Exception
     */
    @Test
    public void selectOne() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        User user = s.selectOne("users.selectOne",1);
        System.out.println(user.getName());
        for (Order order : user.getOrders()) {
            System.out.println(order.getId()+" "+order.getOrderNo());
        }
        s.commit();
        s.close();
    }

    /**
     * selectAll
     * @throws Exception
     */
    @Test
    public void selectAll() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        List<User> users = s.selectList("users.selectAll");
        for (User user : users) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getAge());
        }
        s.commit();
        s.close();
    }

    @Test
    public void deleteOne() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        int res = s.delete("users.deleteOne", 4);
        System.out.println(res);
        s.commit();
        s.close();
    }

    @Test
    public void deleteAll() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        int res = s.delete("users.deleteAll");
        System.out.println(res);
        s.commit();
        s.close();
    }
}
