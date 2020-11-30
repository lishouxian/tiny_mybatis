package com.xian.tinybatis.sqlSession;

import lombok.Data;

/**
 * MappedStatement
 *
 * @author lishouxian
 * @since 2020/11/30 19:06
 */
@Data
public class MappedStatement <T> {
    String sqlCommand;
    private final SqlSession sqlSession;
    private final Class<T> mapperInterface;

}
