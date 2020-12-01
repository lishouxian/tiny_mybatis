package com.xian.tinybatis.sqlSession;

import com.xian.tinybatis.config.Configuration;
import lombok.Data;

/**
 * MappedStatement
 *
 * @author lishouxian
 * @since 2020/11/30 19:06
 */
@Data
public class MappedStatement <T> {
    public String sqlCommand;
    private final Configuration configuration;
    private final Class<T> mapperInterface;

}
