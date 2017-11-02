package com.it18zhang.mybatisdemo.dao;

import com.it18zhang.mybatisdemo.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * UserDao
 * @author hongXkeX
 * @date 2017/11/1 9:40
 */
public class UserDao {

    /**
     * insert
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
     * update
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

    /**
     * selectOne
     * @param id
     * @return
     */
    public User selectOne(final Integer id) {
        return (User)DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession s) {
                return s.selectOne("users.selectOne", id);
            }
        });
    }

    /**
     * selectAll
     * @return
     */
    public List<User> selectAll() {
        return (List<User>)DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession s) {
                return s.selectList("users.selectAll");
            }
        });
    }
}
