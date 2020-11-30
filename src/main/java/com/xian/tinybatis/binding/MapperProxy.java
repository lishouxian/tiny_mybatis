package com.xian.tinybatis.binding;

import com.xian.tinybatis.sqlSession.SqlSession;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

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
    private final Map<Method, MapperMethod> methodCache;

    public MapperProxy(SqlSession sqlSession, Class<T> mapperInterface, Map<Method, MapperMethod> methodCache) {
        this.sqlSession = sqlSession;
        this.mapperInterface = mapperInterface;
        this.methodCache = methodCache;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        //代理以后，所有Mapper的方法调用时，都会调用这个invoke方法
        //并不是任何一个方法都需要执行调用代理对象进行执行，如果这个方法是Object中通用的方法（toString、hashCode等）无需执行
//        if (Object.class.equals(method.getDeclaringClass())) {
//            try {
//                return method.invoke(this, args);
//            } catch (Throwable t) {
//                System.out.println("执行代理失败");
//            }
//        }
        //TODO 使用缓存
        //final MapperMethod mapperMethod = cachedMapperMethod(method);
        //执行
        System.out.println(mapperInterface);
        System.out.println(method);
        System.out.println(args);
        MapperMethod mapperMethod = new MapperMethod(mapperInterface, method, sqlSession.getConfiguration());

        return mapperMethod.execute(sqlSession, args);
    }
//    //去缓存中找MapperMethod
//    private MapperMethod cachedMapperMethod(Method method) {
//        MapperMethod mapperMethod = methodCache.get(method);
//        if (mapperMethod == null) {
//            //找不到才去new
//            mapperMethod = new MapperMethod(mapperInterface, method, sqlSession.getConfiguration());
//            methodCache.put(method, mapperMethod);
//        }
//        return mapperMethod;
//    }

}
