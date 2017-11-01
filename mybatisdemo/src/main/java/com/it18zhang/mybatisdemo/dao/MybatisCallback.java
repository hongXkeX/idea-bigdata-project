package com.it18zhang.mybatisdemo.dao;

import org.apache.ibatis.session.SqlSession;

/**
 * 回调接口
 * @author hongXkeX
 * @date 2017/11/1 10:19
 */
public interface MybatisCallback {
    public Object doInMybatis(SqlSession s);
}
