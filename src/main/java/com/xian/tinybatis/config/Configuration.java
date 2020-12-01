package com.xian.tinybatis.config;

import com.xian.tinybatis.binding.MapperRegistry;
import com.xian.tinybatis.sqlSession.DefaultSqlSession;
import com.xian.tinybatis.sqlSession.MappedStatement;
import com.xian.tinybatis.sqlSession.SqlSession;
import lombok.Data;

import javax.sql.DataSource;
import java.util.HashMap;
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
    Map<String, MappedStatement> mappedStatements = new HashMap<>();

    public DataSource getDataSource() {
        return dataSource;
    }

    public void addMapper(Class<?> type){
        mapperRegistry.addMapper(type);

    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public MappedStatement getMappedStatement(String statement) {
        return mappedStatements.get(statement);
    }



    public void addMappedStatement(String mappedStatementName,MappedStatement mappedStatement) {
        mappedStatements.put(mappedStatementName,mappedStatement);
    }

    public <T> T getMapper(Class<?> type, SqlSession sqlSession) {
        return (T) mapperRegistry.getMapper(type, sqlSession);
    }
}
