package com.it18zhang.mybatisdemo.dao;

import com.it18zhang.mybatisdemo.util.Util;
import org.apache.ibatis.session.SqlSession;

/**
 * 模板类
 * @author hongXkeX
 * @date 2017/11/1 10:14
 */
public class DaoTemplate {

    /**
     * 执行
     */
    public static Object execute(MybatisCallback cb) {
        SqlSession s = null;
        try {
            s = Util.openSession();
            Object ret = cb.doInMybatis(s);
            s.commit();
            return ret;
        } catch (Exception e) {
            e.printStackTrace();
            Util.rollbackTx(s);
        } finally {
            Util.closeSession(s);
        }
        return null;
    }
}
