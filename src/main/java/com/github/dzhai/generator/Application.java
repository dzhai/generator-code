package com.github.dzhai.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动类
 * @author zhaicl
 * @date 2016年12月6日 下午7:32:41
 */
@ServletComponentScan
@SpringBootApplication
@ImportResource({ "classpath:applicationContext.xml" })
public class Application {
	
	private static Logger logger=LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		logger.info("开始启动");
		SpringApplication.run(Application.class, args);
		logger.info("启动完成");
	}	
}
