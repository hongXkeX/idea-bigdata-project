package com.it18zhang.mybatisdemo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author hongXkeX
 * @date 2017/10/31 9:30
 */
public class App {
    public static void main(String[] args) {
        try {
            // 指定配置文件的路径（类路径）
            String resource = "mybatis-config.xml";
            // 加载文件
            InputStream inputStream = Resources.getResourceAsStream(resource);
            // 创建会话工厂Builder 相当于连接池
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
            // 通过sf开启会话 相当于建立连接
            SqlSession s = sf.openSession();
            System.out.println(s);
            System.out.println("Hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
