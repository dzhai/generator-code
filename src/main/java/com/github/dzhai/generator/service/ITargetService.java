package com.github.dzhai.generator.service;

import java.util.List;
import com.github.dzhai.generator.model.GenTable;
import com.github.dzhai.generator.model.GenTableColumn;

public interface ITargetService {

	public List<GenTableColumn> selectColumns(String tableSchema,String tableName);

	public List<GenTable> selectTables(String tableSchema);
		
	public List<String> selectSchemas();
}
