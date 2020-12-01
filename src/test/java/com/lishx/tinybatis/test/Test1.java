package com.lishx.tinybatis.test;


import com.lishx.tinybatis.bean.User;
import com.lishx.tinybatis.config.Configuration;
import com.lishx.tinybatis.mapper.UserMapper;
import com.lishx.tinybatis.sqlSession.SqlSession;
import com.lishx.tinybatis.sqlSession.SqlSessionFactory;
import com.lishx.tinybatis.sqlSession.SqlSessionFactoryBuilder;

import java.sql.SQLException;
import java.util.List;

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
        List<User> users = userMapper.selectList();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();

    }

}
