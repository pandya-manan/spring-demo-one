package com.manan.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
			
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("Email address setter invoked: "+emailAddress);
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("Team setter invoked: "+team);
		this.team = team;
	}
	public CricketCoach() {
		System.out.println("Cricket Coach created!!");
	}
	//setter method to set fortune service
	public void setfortuneService(FortuneService fortuneService) {
		System.out.println("Setter method for fortune service in cricket coach invoked!!");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		String message="Run around the Modi Stadium 5 times a day!!";
		return message;
	}

	@Override
	public String getDailyFortune() {
		String message="Upon completion of daily workout you shall get a GM bat for free!!";
		return message;
	}

}
