package com.xian.tinybatis.test;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.xian.tinybatis.config.Configuration;
import com.xian.tinybatis.mapper.UserMapper;
import com.xian.tinybatis.sqlSession.MappedStatement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 *
 * @author lishouxian
 * @since 2020/11/29 20:18
 *  DataSourceConfiguration
 */
public class DirectConfiguration {


    private static DataSource dataSource;
    private static final Configuration CONFIGURATION = new Configuration();


    public static Configuration getConfiguration() {
        Properties pro = new Properties();
        try {
            pro.load(DirectConfiguration.class.getClassLoader().getResourceAsStream("druid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(pro);

        } catch (Exception e) {
            e.printStackTrace();
        }
        CONFIGURATION.setDataSource(dataSource);

        MappedStatement<UserMapper> userMapperMappedStatement = new MappedStatement<>(CONFIGURATION, UserMapper.class);
        userMapperMappedStatement.setSqlCommand("select * from user");
        CONFIGURATION.addMappedStatement("com.xian.tinybatis.mapper.UserMapper.selectList",userMapperMappedStatement);

        return CONFIGURATION;

    }
}
