package com.lishx.tinybatis.binding;

import com.lishx.tinybatis.sqlSession.SqlSession;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * MapperProxy
 *
 * @author lishouxian
 * @since 2020/11/30 09:50
 */
public class MapperProxy <T> implements InvocationHandler, Serializable {
    private static final long serialVersionUID = -6424540398559729838L;
    private final SqlSession sqlSession;
    private final Class<T> mapperInterface;

    public MapperProxy(SqlSession sqlSession, Class<T> mapperInterface) {
        this.sqlSession = sqlSession;
        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        //TODO 使用缓存
        //final MapperMethod mapperMethod = cachedMapperMethod(method);
        //执行

        MapperMethod mapperMethod = new MapperMethod(mapperInterface, method, sqlSession.getConfiguration());

        return mapperMethod.execute(sqlSession, args);
    }


}
