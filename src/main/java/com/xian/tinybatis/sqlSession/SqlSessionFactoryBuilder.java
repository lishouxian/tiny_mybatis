package com.xian.tinybatis.sqlSession;

import com.xian.tinybatis.config.Configuration;

import java.io.InputStream;

/**
 * @author lishouxian
 * @since 2020/11/29 20:03
 *  SqlSessionFactoryBuilder
 */
public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(InputStream inputStream) {

        //TODO 从xml文件中读取配置文件 和 从xml文件中解析配置文件
        //XMLConfigBuilder xmlConfigerBuilder = new XMLConfigBuilder(configuration);
        //Configuration configuration = xmlConfigerBuilder.parseConfiguration(inputStream);

        //获取到默认的数据库配置
        Configuration configuration = new Configuration();

        //返回一个sqlSessionFactory
        return new DefaultSqlSessionFactory(configuration);
    }

    public SqlSessionFactory build(Configuration configuration) {

        //返回一个sqlSessionFactory
        return new DefaultSqlSessionFactory(configuration);
    }
}
