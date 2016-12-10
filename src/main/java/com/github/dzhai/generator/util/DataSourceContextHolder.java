package com.github.dzhai.generator.util;

/**
 * 
* @ClassName: DataSourceContextHolder
* @Description: 数据源类型设置
* @author Nirvana
* @date 2016年8月16日 下午5:09:28
*
 */
public class DataSourceContextHolder {  
	 
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();  
  
    public static void setDbType(String dbType) {  
        contextHolder.set(dbType);  
    }  
  
    public static String getDbType() {  
        return ((String) contextHolder.get());  
    }  
  
    public static void clearDbType() {  
        contextHolder.remove();  
    }  
}  
