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
    private String command;
    private final MethodSignature method;

    public MapperMethod(Class<?> mapperInterface, Method method, Configuration config) {
        // 创建 SqlCommand 对象，该对象包含一些和 SQL 相关的信息
        this.command = new String();
        // 创建 MethodSignature 对象，由类名可知，该对象包含了被拦截方法的一些信息
        this.method = new MethodSignature();
    }

    public Object execute(SqlSession sqlSession, Object[] args) {
        return sqlSession.selectList(command, args);
    }


    public static class MethodSignature {}
}
