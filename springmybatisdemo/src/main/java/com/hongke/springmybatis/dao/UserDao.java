package com.hongke.springmybatis.dao;

import com.hongke.springmybatis.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author hongXkeX
 * @date 2017/11/5 10:08
 */
public class UserDao extends SqlSessionDaoSupport implements BaseDao<User>{

    public void insert(User user) {
        getSqlSession().insert("users.insert", user);
    }

    public void update(User user) {
        getSqlSession().update("users.update", user);
    }

    public void delete(Integer id) {
        getSqlSession().delete("users.delete", id);
    }

    public User selectOne(Integer id) {
        return getSqlSession().selectOne("users.selectOne", id);
    }

    public List<User> selectAll() {
        return getSqlSession().selectList("users.selectAll");
    }
}
