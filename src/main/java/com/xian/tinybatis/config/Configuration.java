package com.xian.tinybatis.config;

import lombok.Data;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: lishouxian
 * @date: 2020/11/29 20:04
 * @description: Configuration
 */
@Data
public class Configuration {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return DataSourceConfiguration.getDataSource();
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
