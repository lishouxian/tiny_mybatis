package com.lishx.tinybatis.test;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.lishx.tinybatis.bean.User;
import com.lishx.tinybatis.config.Configuration;
import com.lishx.tinybatis.mapper.UserMapper;
import com.lishx.tinybatis.sqlSession.MappedStatement;

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

        MappedStatement userMapperMappedStatement = new MappedStatement(CONFIGURATION, UserMapper.class);
        userMapperMappedStatement.setSqlCommand("select * from user");
        userMapperMappedStatement.setResultType(User.class);
        CONFIGURATION.addMappedStatement("com.lishx.tinybatis.mapper.UserMapper.selectList",userMapperMappedStatement);

        return CONFIGURATION;

    }
}
