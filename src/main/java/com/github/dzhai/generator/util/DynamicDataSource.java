package com.github.dzhai.generator.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 
* @ClassName: DynamicDataSource
* @Description: 动态数据源类
* @author Nirvana
* @date 2016年8月16日 下午5:09:10
*
 */
public class DynamicDataSource extends AbstractRoutingDataSource {  
    @Override  
    protected Object determineCurrentLookupKey() {  
        return DataSourceContextHolder.getDbType();  
    }  
}
