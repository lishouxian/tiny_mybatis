package com.lishx.tinybatis.executor;

import com.lishx.tinybatis.sqlSession.MappedStatement;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * ResultSetHandler
 *
 * @author lishouxian
 * @since 2020/11/30 21:53
 */
public class ResultSetHandler {
    MappedStatement mappedStatement;

    public ResultSetHandler(MappedStatement mappedStatement) {
        this.mappedStatement = mappedStatement;
    }

    public <E> List<E> handle(ResultSet resultSet) {
        Class<?> resultType = mappedStatement.getResultType();

        ArrayList<E> results = new ArrayList<E>();
        try {
            while (resultSet.next()) {
                ResultSetMetaData metaData = resultSet.getMetaData();
                E o = (E) resultType.newInstance();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object value = resultSet.getObject(columnName);
                    PropertyDescriptor propertyDescriptor = new PropertyDescriptor(columnName, resultType);
                    Method writeMethod = propertyDescriptor.getWriteMethod();
                    writeMethod.invoke(o, value);
                }
                results.add(o);
            }
        }catch (Exception e){

        }
        return results;
    }
}
