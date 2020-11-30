package com.xian.tinybatis.sqlSession;

/**
 * @author lishouxian
 * @since 2020/11/29 20:03
 *  SqlSessionFactory
 */
public interface SqlSessionFactory {
    SqlSession openSession();

}
