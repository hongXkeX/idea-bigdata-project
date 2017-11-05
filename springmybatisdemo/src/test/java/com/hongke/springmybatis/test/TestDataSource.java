package com.hongke.springmybatis.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * 测试数据源
 * @author hongXkeX
 * @date 2017/11/5 9:47
 */
public class TestDataSource {
    @Test
    public void testConn() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        DataSource ds = (DataSource)ac.getBean("dataSource");
        System.out.println(ds.getConnection());

    }
}
