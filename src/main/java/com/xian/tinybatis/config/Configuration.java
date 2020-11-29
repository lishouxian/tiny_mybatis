package com.xian.tinybatis.config;

import lombok.Data;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: lishouxian
 * @date: 2020/11/29 20:04
 * @description: Configuration
 */
@Data
public class Configuration {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
