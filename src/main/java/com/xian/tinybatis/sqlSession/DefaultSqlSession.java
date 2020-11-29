package com.xian.tinybatis.sqlSession;

import com.xian.tinybatis.config.Configuration;

import java.sql.SQLException;
import java.util.List;

/**
 * @author lishouxian
 * @date: 2020/11/29 20:02
 * @description DefaultSqlSession
 */
public class DefaultSqlSession implements SqlSession{

    private Configuration configuration;

    /**
     * 初始化方式
     * @param configuration
     */
    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
    }


    public <E> List<E> selectList(String statementId, Object param) throws Exception {
        return null;
    }

    public <T> T selectOne(String statementId, Object params) throws Exception {
        return null;
    }

    public int insert(String statement) throws Exception {
        return 0;
    }

    public int insert(String statement, Object parameter) throws Exception {
        return 0;
    }

    public int update(String statement) throws Exception {
        return 0;
    }

    public int update(String statement, Object parameter) throws Exception {
        return 0;
    }

    public int delete(String statement) throws Exception {
        return 0;
    }

    public int delete(String statement, Object parameter) throws Exception {
        return 0;
    }

    public void close() throws SQLException {

    }

    public <T> T getMapper(Class<?> mapperClass) {
        return null;
    }
}
