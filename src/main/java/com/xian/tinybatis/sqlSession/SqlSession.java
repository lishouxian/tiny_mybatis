package com.xian.tinybatis.sqlSession;

import com.xian.tinybatis.config.Configuration;

import java.sql.SQLException;
import java.util.List;

/**
 * @author lishouxian
 * @since 2020/11/29 20:00
 *  SqlSession
 */
public interface SqlSession {
    <E> List<E> selectList(String statement, Object param);

    <T> T selectOne(String statementId, Object params) throws
            Exception;


    int insert(String statement) throws Exception;

    int insert(String statement, Object parameter) throws Exception;

    int update(String statement) throws Exception;

    int update(String statement, Object parameter) throws Exception;

    int delete(String statement) throws Exception;


    int delete(String statement, Object parameter) throws Exception;


    void close() throws SQLException;


    //TODO 为Dao接口生成代理实现类
    <T> T getMapper(Class<?> mapperClass);

    Configuration getConfiguration();
}
