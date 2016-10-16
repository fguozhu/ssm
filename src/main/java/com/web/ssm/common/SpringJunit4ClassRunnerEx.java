package com.web.ssm.common;

import java.io.FileNotFoundException;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

/**
 * @author nicholas
 */
public class SpringJunit4ClassRunnerEx extends SpringJUnit4ClassRunner {

	static{
		try{
			Log4jConfigurer.initLogging("classpath:log4j.properties");
		}catch(FileNotFoundException e){
			System.err.println("Cannot Initalize Log4j");
		}
	}
	
	public SpringJunit4ClassRunnerEx(Class<?> clazz) throws InitializationError {
		super(clazz);
	}

}