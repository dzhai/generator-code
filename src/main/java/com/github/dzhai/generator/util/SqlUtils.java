package com.github.dzhai.generator.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.math.NumberUtils;

import com.github.dzhai.generator.model.GenTableColumn;

public class SqlUtils {
	public static void convert(List<GenTableColumn> columns) {
		if (columns == null || columns.size() == 0) {
			return;
		}

		for (GenTableColumn item : columns) {
			item.setJavaField(convertJavaField(item.getName()));
			String jdbcType=item.getJdbcType();
			int length=0;
			if(item.getJdbcType().contains("(")){
				length=NumberUtils.toInt(jdbcType.substring(jdbcType.indexOf("("), jdbcType.indexOf(")")),0);
			}
			item.setJavaType(convertJavaType(item.getMybatisJdbcType(),length));

		}

	}

	private static String convertJavaType(String sqlType,int length) {
		sqlType = sqlType.toUpperCase();
		String name = "";
		switch (sqlType) {
		case "VARCHAR":
			name = "String";
			break;
		case "CHAR":
			name = "String";
			break;

		case "TEXT":
			name = "String";
			break;

		case "INT":
			if(length==1){
				name = "Boolean";
			}else{
				name = "Integer";
			}			
			break;

		case "TINYINT":
			if(length==1){
				name = "Boolean";
			}else{
				name = "Integer";
			}		
			break;

		case "SMALLINT":
			if(length==1){
				name = "Boolean";
			}else{
				name = "Integer";
			}	
			break;

		case "BIT":
			name = "Boolean";
			break;
		case "BIGINT":
			name = "Long";
			break;

		case "FLOAT":
			name = "Float";
			break;

		case "DOUBLE":
			name="Double";
			break;

		case "DECIMAL":
			name="BigDecimal";
			break;

		case "DATE":
			name="Date";
			break;

		case "DATETIME":
			name="Date";
			break;

		case "TIMESTAMP":
			name="Date";
			break;

		default:
			name = "String";
			break;
		}
		return name;
	}

	private static String convertJavaField(String sqlName) {
		StringBuffer name = new StringBuffer("");
		sqlName = sqlName.toLowerCase();
		if (sqlName.contains("_")) {
			String[] strs = sqlName.split("_");
			for (String str : strs) {
				if (name.length() == 0) {
					name.append(str);
				} else {
					char[] chars = str.toCharArray();
					chars[0] -= 32;
					name.append(String.valueOf(chars));
				}
			}
		} else {
			name.append(sqlName);
		}
		return name.toString();
	}
}
