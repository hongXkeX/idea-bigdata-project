package com.hongke.springmybatis.dao;

import java.util.List;

/**
 * 基本Dao接口
 * @author hongXkeX
 * @date 2017/11/5 10:11
 */
public interface BaseDao<T> {
    public void insert(T t);
    public void update(T t);
    public void delete(Integer id);
    public T selectOne(Integer id);
    public List<T> selectAll();
}
