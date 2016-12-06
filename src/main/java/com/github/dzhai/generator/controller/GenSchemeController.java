package com.github.dzhai.generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("genScheme")
public class GenSchemeController {

	private String basePath="genScheme";
	
	@RequestMapping("list")
	public String list(){
		return basePath+"/list";
	}
}
