package com.github.dzhai.generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("genTable")
public class GenTableController {

	private String basePath="genTable";
	
	@RequestMapping("list")
	public String list(){
		
		return basePath+"/list";
	}
	
	@RequestMapping("create")
	public String create(){
		
		return basePath+"/create";
	}
}
