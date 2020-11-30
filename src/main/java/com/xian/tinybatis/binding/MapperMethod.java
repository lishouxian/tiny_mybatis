package com.xian.tinybatis.binding;

import com.xian.tinybatis.config.Configuration;
import com.xian.tinybatis.sqlSession.SqlSession;

import java.lang.reflect.Method;

/**
 * MapperMethod
 *
 * @author lishouxian
 * @since 2020/11/30 09:57
 */
public class MapperMethod {
    private SqlCommand command;
    private final MethodSignature method;

    public MapperMethod(Class<?> mapperInterface, Method method, Configuration config) {
        this.command = new SqlCommand(config, mapperInterface, method);
        this.method = new MethodSignature(config, method);
    }

    public Object execute(SqlSession sqlSession, Object[] args) {
    }

    public static class SqlCommand {}
    public static class MethodSignature {}
}
