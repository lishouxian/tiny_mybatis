package com.xian.tinybatis.executor;

import com.xian.tinybatis.sqlSession.MappedStatement;

import java.sql.ResultSet;
import java.util.List;

/**
 * ResultSetHandler
 *
 * @author lishouxian
 * @since 2020/11/30 21:53
 */
public class ResultSetHandler {
    MappedStatement mappedStatement;

    public ResultSetHandler(MappedStatement mappedStatement) {
        this.mappedStatement = mappedStatement;
    }

    public <E> List<E> handle(ResultSet resultSet) {

    }
}
