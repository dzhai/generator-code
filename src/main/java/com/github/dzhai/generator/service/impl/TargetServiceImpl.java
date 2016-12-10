package com.github.dzhai.generator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.dzhai.generator.mapper.TargetMapper;
import com.github.dzhai.generator.model.GenTable;
import com.github.dzhai.generator.model.GenTableColumn;
import com.github.dzhai.generator.service.ITargetService;

@Service("targetService")
public class TargetServiceImpl implements ITargetService {

	@Autowired
	private TargetMapper targetMapper;

	@Override
	public List<GenTableColumn> selectColumns(String tableSchema, String tableName) {
		return targetMapper.selectColumns(tableSchema, tableName);
	}

	@Override
	public List<GenTable> selectTables(String tableSchema) {
		return targetMapper.selectTables(tableSchema);
	}

}
