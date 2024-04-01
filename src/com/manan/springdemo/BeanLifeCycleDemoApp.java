package com.manan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach=context.getBean("trackCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("trackCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("\nPointing out the result: "+result);
		
		System.out.println("\nMemory location for theCoach: "+theCoach);
		
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
		
		
	}

}
