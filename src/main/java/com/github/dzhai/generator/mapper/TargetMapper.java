package com.github.dzhai.generator.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.dzhai.generator.model.GenTable;
import com.github.dzhai.generator.model.GenTableColumn;

public interface TargetMapper {

	public List<GenTableColumn> selectColumns(@Param("tableSchema") String tableSchema,@Param("tableName") String tableName);

	public List<GenTable> selectTables(@Param("tableSchema") String tableSchema);
	
}
