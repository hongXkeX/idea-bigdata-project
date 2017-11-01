package com.it18zhang.mybatisdemo.dao;

import com.it18zhang.mybatisdemo.domain.User;
import com.it18zhang.mybatisdemo.util.Util;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * UserDao
 * @author hongXkeX
 * @date 2017/11/1 9:40
 */
public class UserDao {

    /**
     * 插入操作
     * @param user
     */
    public void insert(User user) {
        SqlSession s = null;
        try {
            s = Util.openSession();
            s.insert("users.insert", user);
            s.commit();
        } catch (Exception e) {
            e.printStackTrace();
            Util.rollbackTx(s);
        } finally {
            Util.closeSession(s);
        }
    }

    /**
     * 更新操作
     * @param user
     */
    public void update(User user) {
        SqlSession s = null;
        try {
            s = Util.openSession();
            s.update("users.update", user);
            s.commit();
        } catch (Exception e) {
            e.printStackTrace();
            Util.rollbackTx(s);
        } finally {
            Util.closeSession(s);
        }
    }
}
