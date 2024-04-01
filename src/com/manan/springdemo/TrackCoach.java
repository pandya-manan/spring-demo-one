package com.manan.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		String message="Run atleast around 5 kms.";
		return message;
		
	}

	public TrackCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyFortune() {
		String message="Just Do It!!: "+fortuneService.getFortune();
		return message;
	}

	//Adding an init method
	public void doMyPractice()
	{
		System.out.println("Track Coach: Inside Init Do Practice Method!");
	}
	//Adding a destroy method
	public void doMyPracticeEnd()
	{
		System.out.println("Track Coach: Inside method to end the practice!");
	}
}
