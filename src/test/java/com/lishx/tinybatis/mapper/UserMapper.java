package com.lishx.tinybatis.mapper;



import com.lishx.tinybatis.announction.Select;
import com.lishx.tinybatis.bean.User;

import java.util.List;
/**
 * @author lishouxian
 * @since 2020/11/29 19:55
 *  user
 */
public interface UserMapper {

    //查询所有用户
    @Select("select * from user")
    List<User> selectList();

    //根据条件进行用户查询id
    @Select("select * from user where id = #{id}")
    User selectOne(User user);

    User selectById(Integer id);

    int updateById(User user);

    int insert(User user);

    int delete(User user);

}
