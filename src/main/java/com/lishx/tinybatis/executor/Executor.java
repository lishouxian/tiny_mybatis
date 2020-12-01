package com.lishx.tinybatis.executor;

import com.lishx.tinybatis.config.Configuration;
import com.lishx.tinybatis.sqlSession.MappedStatement;

import java.util.List;

/**
 * executor
 *
 * @author lishouxian
 * @since 2020/11/30 19:00
 */
public interface Executor {

    <E> List<E> query(MappedStatement mappedStatement, Configuration configuration);
}
