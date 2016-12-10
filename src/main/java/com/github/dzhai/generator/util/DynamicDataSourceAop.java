package com.github.dzhai.generator.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(-1)
public class DynamicDataSourceAop {
	
	private Logger log=LoggerFactory.getLogger(DynamicDataSourceAop.class);
	
	@Around("execution(* com.github.dzhai.generator.service..*.*(..)) ")
	public Object doAround(ProceedingJoinPoint jp) throws Throwable {
		String targetName = jp.getTarget().getClass().getName();
		if (targetName.contains("TargetServiceImpl")) {
			DataSourceContextHolder.setDbType("target");
		}else{			
			DataSourceContextHolder.setDbType("gen");
		}		
		log.debug(targetName+":"+DataSourceContextHolder.getDbType());	
		return jp.proceed();
	}
}
