package com.miraenoh.springdemo;

import com.miraenoh.springdemo.services.FortuneService;

public class TennisCoach implements Coach {
    private String emailAddress;
    private String team;

    private FortuneService fortuneService;

    //  Create a no-arg constructor
    public TennisCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    //  Our setter methods for DI
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice swinging for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }
}
