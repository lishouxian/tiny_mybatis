package com.xian.tinybatis.config;

import com.xian.tinybatis.binding.MapperRegistry;
import com.xian.tinybatis.sqlSession.MappedStatement;
import com.xian.tinybatis.sqlSession.SqlSession;
import lombok.Data;

import javax.sql.DataSource;
import java.util.Map;


/**
 * Configuration
 * @author lishouxian
 * @since 2020/11/29 20:04
 */
@Data
public class Configuration {

    private DataSource dataSource;
    private MapperRegistry mapperRegistry = new MapperRegistry();
    Map<String, MappedStatement> mappedStatements =
    public DataSource getDataSource() {
        return dataSource;
    }

    public void addMapper(Class<?> type){
        mapperRegistry.addMapper(type);

    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public <T> T getMapper(Class<?> type, SqlSession sqlSession) {
        return (T) mapperRegistry.getMapper(type, sqlSession);
    }

    public MappedStatement getMappedStatement(String statement) {
        return new MappedStatement();
    }
}
