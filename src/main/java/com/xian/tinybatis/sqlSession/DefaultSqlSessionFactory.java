package com.xian.tinybatis.sqlSession;

import com.xian.tinybatis.config.Configuration;

/**
 * @auther: lishouxian
 * @date: 2020/11/29 20:08
 * @description: DefaultSqlSessionFactory
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
