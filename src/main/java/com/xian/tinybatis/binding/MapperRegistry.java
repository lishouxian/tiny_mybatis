package com.xian.tinybatis.binding;

import com.xian.tinybatis.sqlSession.SqlSession;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * MapperRegistry
 *
 * @author lishouxian
 * @since 2020/11/30 09:35
 */
public class MapperRegistry  {
    private final Map<Class<?>, MapperProxyFactory<?>> knownMappers = new HashMap<>();

    @SuppressWarnings("unchecked")
    public <T> T getMapper(Class<T> type, SqlSession sqlSession) {
        // 从 knownMappers 中获取与 type 对应的 MapperProxyFactory
        final MapperProxyFactory<T> mapperProxyFactory = (MapperProxyFactory<T>) knownMappers.get(type);
        if (mapperProxyFactory == null) {
            System.out.println("Type " + type + " is not known to the MapperRegistry.");
        }
        try {
            // 创建代理对象
            System.out.println("创建代理对象");
            return mapperProxyFactory.newInstance(sqlSession);
        } catch (Exception e) {
            System.out.println("创建代理对象失败");
        }
        return null;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }

    public <T> void addMapper(Class<?> type) {
        knownMappers.put(type, new MapperProxyFactory<>(type));

    }
}
