package com.xian.tinybatis.mapper;



import com.xian.tinybatis.bean.User;

import java.util.List;
/**
 * @auther: lishouxian
 * @date: 2020/11/29 19:55
 * @description: user
 */
public interface UserMapper {

    //查询所有用户
    List<User> findAll() throws Exception;

    //根据条件进行用户查询
    User findByCondition(User user) throws Exception;

    int updatePasswordById(User user) throws Exception;

    int insertUser(User user) throws Exception;

    int deleteUser(User user) throws Exception;

}
