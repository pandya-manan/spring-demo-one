package com.manan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//retrieve the bean from the container
		Coach theCoach=context.getBean("trackCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		//close the context
		context.close();
		
		
	}

}
