package com.miraenoh.springdemo;

import com.miraenoh.springdemo.services.FortuneService;

public class BaseBallCoach implements Coach {
    //  Define a private field for the dependency
    private FortuneService fortuneService;

    //  Define a constructor for dependency injection
    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //  Use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}