package com.manan.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String message="You are lucky today!! You have won $1200";
		return message;
	}

}
