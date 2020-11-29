package com.xian.tinybatis.sqlSession;

import java.sql.SQLException;
import java.util.List;

/**
 * @auther: lishouxian
 * @date: 2020/11/29 20:00
 * @description: SqlSession
 */
public interface SqlSession {
    <E> List<E> selectList(String statementId, Object param) throws
            Exception;

    <T> T selectOne(String statementId, Object params) throws
            Exception;


    int insert(String statement) throws Exception;

    int insert(String statement, Object parameter) throws Exception;

    int update(String statement) throws Exception;

    int update(String statement, Object parameter) throws Exception;

    int delete(String statement) throws Exception;


    int delete(String statement, Object parameter) throws Exception;


    void close() throws SQLException;


    //为Dao接口生成代理实现类
    <T> T getMapper(Class<?> mapperClass);
}
