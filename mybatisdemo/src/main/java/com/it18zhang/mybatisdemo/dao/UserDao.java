package com.it18zhang.mybatisdemo.dao;

import com.it18zhang.mybatisdemo.domain.User;
import com.it18zhang.mybatisdemo.util.Util;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

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
    public void insert(final User user) {
        DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession s) {
                s.insert("users.insert", user);
                return null;
            }
        });
    }

    /**
     * 更新操作
     * @param user
     */
    public void update(final User user) {
        DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession s) {
                s.update("users.update", user);
                return null;
            }
        });
    }

    public User selectOne(final Integer id) {
        return (User)DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession s) {
                return s.selectOne("users.selectOne", id);
            }
        });
    }

    public List<User> selectAll() {
        return (List<User>)DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession s) {
                return s.selectList("users.selectAll");
            }
        });
    }



}
