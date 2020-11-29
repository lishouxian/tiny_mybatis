package com.xian.tinybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/**
 *
 * @author: lishouxian
 * @date: 2020/11/29 20:18
 * @description: DataSourceConfiguration
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
        return CONFIGURATION;

    }
}
