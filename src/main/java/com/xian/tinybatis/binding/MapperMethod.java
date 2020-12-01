package com.xian.tinybatis.binding;

import com.xian.tinybatis.config.Configuration;
import com.xian.tinybatis.sqlSession.MappedStatement;
import com.xian.tinybatis.sqlSession.SqlSession;
import lombok.Data;

import java.lang.reflect.Method;

/**
 * MapperMethod
 *
 * @author lishouxian
 * @since 2020/11/30 09:57
 */
public class MapperMethod {
    String statementName;

    //TODO 获取command的类型对应SQLsession的方法
    public MapperMethod(Class<?> mapperInterface, Method method, Configuration config) {
        statementName = mapperInterface.getName() + "." + method.getName();
        // 创建 SqlCommand 对象，该对象包含一些和 SQL 相关的信息
        // 创建 MethodSignature 对象，由类名可知，该对象包含了被拦截方法的一些信息
    }

    public Object execute(SqlSession sqlSession, Object[] args) {
        System.out.println("这里输出Statementname" + statementName);

        return sqlSession.selectList(statementName, args);
    }

    @Data
    public static class SqlCommand {
        private final String name;

        public SqlCommand(Configuration configuration, Class<?> mapperInterface, Method method){
            String statementName = mapperInterface.getName() + "." + method.getName();
            MappedStatement ms = configuration.getMappedStatement(statementName);
            name = ms.getSqlCommand();
        }


    }
}
