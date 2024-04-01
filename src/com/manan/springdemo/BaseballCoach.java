package com.manan.springdemo;

public class BaseballCoach implements Coach{

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		String message="Spend about 30 minutes on batting practice.";
		return message;
}

	@Override
	public String getDailyFortune() {
		//use fortuneService to get a fortune
		return fortuneService.getFortune();
		
	}

	
}
