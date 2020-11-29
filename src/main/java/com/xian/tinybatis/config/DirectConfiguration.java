package com.xian.tinybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/**
 * @auther: lishouxian
 * @date: 2020/11/29 20:18
 * @description: DataSourceConfiguration
 */
public class DirectConfiguration {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://47.103.199.145:3306/HRManagement?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai";
    private static final String username = "root";
    private static final String password = "123456";

    private static DataSource dataSource;
    private static Configuration configuration = new Configuration();


    public static Configuration getConfiguration() {
        Properties pro = new Properties();
        try {
            pro.load(DirectConfiguration.class.getClassLoader().getResourceAsStream("druid.properties"));
            System.out.println(pro);
            dataSource = DruidDataSourceFactory.createDataSource(pro);
            HashMap<String, String> map = new HashMap<>();
            map.put("driver",driver);

            dataSource = DruidDataSourceFactory.createDataSource(map);
            System.out.println(dataSource);
            System.out.println(dataSource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }

        configuration.setDataSource(dataSource);
        return configuration;
    }
}
