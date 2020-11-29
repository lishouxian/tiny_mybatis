package com.xian.tinybatis.config;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

/**
 * @auther: lishouxian
 * @date: 2020/11/29 20:18
 * @description: DataSourceConfiguration
 */
public class DataSourceConfiguration {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://47.103.199.145:3306/HRManagement?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai";
    private static String username = "root";
    private static String password = "123456";

    private static DataSource dataSource = new DruidDataSource();



    public static DataSource getDataSource() {
        return dataSource;
    }
}
