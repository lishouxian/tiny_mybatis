package com.xian.tinybatis.test;


import com.xian.tinybatis.sqlSession.SqlSession;
import com.xian.tinybatis.sqlSession.SqlSessionFactory;
import com.xian.tinybatis.sqlSession.SqlSessionFactoryBuilder;

import java.sql.SQLException;

/**
 * @author lishouxian
 * @date: 2020/11/29 20:36 
 * @description: Test1
 */
public class Test1 {

    public static void main(String[] args) throws SQLException {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
        sqlSession.close();


    }

}
