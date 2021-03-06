package com.lishx.tinybatis.sqlSession;

import com.lishx.tinybatis.config.Configuration;
import com.lishx.tinybatis.executor.DefaultExecutor;
import com.lishx.tinybatis.executor.Executor;

import java.sql.SQLException;
import java.util.List;

/**
 * @author lishouxian
 * @since 2020/11/29 20:02
 * @description DefaultSqlSession
 */
public class DefaultSqlSession implements SqlSession{


    private Configuration configuration;
    private Executor executor;

    /**
     * 初始化方式
     * @param configuration
     */
    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;

        this.executor = new DefaultExecutor();

    }


    public <E> List<E> selectList(String statement, Object param) {
        MappedStatement mappedStatement = configuration.getMappedStatement(statement);
        return executor.query(mappedStatement,configuration);
    }

    public <T> T selectOne(String statement, Object params) throws Exception {

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

    public <T> T getMapper(Class<?> type) {
        return configuration.<T>getMapper(type, this);
    }

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }
}
