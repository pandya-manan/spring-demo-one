package com.manan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args)
	{
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the bean from the spring container
		Coach trackCoach=context.getBean("trackCoach",Coach.class);
		Coach baseballCoach=context.getBean("baseballCoach",Coach.class);
		CricketCoach theCoach=context.getBean("cricketCoach",CricketCoach.class);
		//call methods on the bean
		System.out.println("----------------------------------------------------");
		System.out.println(trackCoach.getDailyWorkOut());
		System.out.println(trackCoach.getDailyFortune());
		System.out.println("----------------------------------------------------");
		System.out.println(baseballCoach.getDailyWorkOut());
		System.out.println(baseballCoach.getDailyFortune());
		System.out.println("----------------------------------------------------");
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();
	}

}
