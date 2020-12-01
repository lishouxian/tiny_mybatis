package com.lishx.tinybatis.sqlSession;

import com.lishx.tinybatis.config.Configuration;

/**
 * @author lishouxian
 * @date 2020/11/29 20:08
 * @description  DefaultSqlSessionFactory
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}
