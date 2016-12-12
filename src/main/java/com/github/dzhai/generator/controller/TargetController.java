package com.github.dzhai.generator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.dzhai.generator.model.GenTable;
import com.github.dzhai.generator.model.GenTableColumn;
import com.github.dzhai.generator.service.ITargetService;
import com.github.dzhai.generator.util.SqlUtils;

@Controller
@RequestMapping("target")
public class TargetController {

	@Autowired
	private ITargetService targetService;
	
	
	
	@RequestMapping("schema")
	@ResponseBody
	public List<String> tableSchema(){
		return targetService.selectSchemas();
	}
	
	@RequestMapping("table")
	@ResponseBody
	public List<GenTable> table(String tableSchema){
		return targetService.selectTables(tableSchema);
	}
	
	@RequestMapping("column")
	public String column(String tableSchema,String tableName,ModelMap model){	
		List<GenTableColumn> columns=targetService.selectColumns(tableSchema, tableName);
		SqlUtils.convert(columns);
		model.put("columns", columns);
		return "genTable/tableColumn";
	}
}
