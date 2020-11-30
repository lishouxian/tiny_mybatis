package com.xian.tinybatis.test;


import com.xian.tinybatis.bean.User;
import com.xian.tinybatis.config.Configuration;
import com.xian.tinybatis.mapper.UserMapper;
import com.xian.tinybatis.sqlSession.SqlSession;
import com.xian.tinybatis.sqlSession.SqlSessionFactory;
import com.xian.tinybatis.sqlSession.SqlSessionFactoryBuilder;

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
        List<User> list = userMapper.selectList();
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();

    }

}
