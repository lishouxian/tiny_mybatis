package com.xian.tinybatis.sqlSession;

import com.xian.tinybatis.config.Configuration;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;

/**
 * @auther: lishouxian
 * @date: 2020/11/29 20:03
 * @description: SqlSessionFactoryBuilder
 */
public class SqlSessionFactoryBuilder {
    private Configuration configuration;

    public SqlSessionFactoryBuilder() {
        this.configuration = new Configuration();
    }

    public SqlSessionFactory build(InputStream inputStream) throws DocumentException, PropertyVetoException, ClassNotFoundException {

        //TODO 从xml文件中读取配置文件
        //XMLConfigBuilder xmlConfigerBuilder = new XMLConfigBuilder(configuration);

        //TODO 从xml文件中解析配置文件
        //Configuration configuration = xmlConfigerBuilder.parseConfiguration(inputStream);

        //获取到默认的数据库配置
        Configuration configuration = new Configuration();
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(configuration);

        //返回一个sqlSessionFactory
        return sqlSessionFactory;
    }

}
