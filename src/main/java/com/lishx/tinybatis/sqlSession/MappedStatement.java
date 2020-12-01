package com.lishx.tinybatis.sqlSession;

import com.lishx.tinybatis.config.Configuration;
import lombok.Data;

import java.lang.reflect.Method;

/**
 * MappedStatement
 *
 * @author lishouxian
 * @since 2020/11/30 19:06
 */
@Data
public class MappedStatement {
    public String sqlCommand;
    public Class<?> resultType;
    private final Configuration configuration;
    private final Class<?> mapperInterface;

}
