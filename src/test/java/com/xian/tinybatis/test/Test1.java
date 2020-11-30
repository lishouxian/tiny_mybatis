package com.xian.tinybatis.test;


import com.xian.tinybatis.bean.User;
import com.xian.tinybatis.config.Configuration;
import com.xian.tinybatis.mapper.UserMapper;
import com.xian.tinybatis.sqlSession.SqlSession;
import com.xian.tinybatis.sqlSession.SqlSessionFactory;
import com.xian.tinybatis.sqlSession.SqlSessionFactoryBuilder;

import java.sql.SQLException;

/**
 * @author lishouxian
 * @since 2020/11/29 20:36
 *  Test1
 */
public class Test1 {


    public static void main(String[] args) throws SQLException {
        Configuration configuration = DirectConfiguration.getConfiguration();
        configuration.addMapper(UserMapper.class);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(configuration);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectOById(1);
        System.out.println(user);
        sqlSession.close();

    }

}
