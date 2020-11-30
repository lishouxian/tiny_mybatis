package com.xian.tinybatis.mapper;



import com.xian.tinybatis.bean.User;

import java.util.List;
/**
 * @author lishouxian
 * @since 2020/11/29 19:55
 *  user
 */
public interface UserMapper {

    //查询所有用户
    List<User> selectList();

    //根据条件进行用户查询
    User selectOne(User user);

    User selectOById(Integer id);

    int updateById(User user);

    int insert(User user);

    int delete(User user);

}
