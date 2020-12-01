package com.lishx.tinybatis.test;

import com.lishx.tinybatis.config.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Test2
 *
 * @author lishouxian
 * @since 2020/11/30 21:20
 */
public class Test2 {

    public static void main(String[] args) throws SQLException {
        Configuration configuration = DirectConfiguration.getConfiguration();
        DataSource dataSource = configuration.getDataSource();
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
