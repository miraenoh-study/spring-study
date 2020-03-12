package com.miraenoh.springdemo.coach;

import com.miraenoh.springdemo.service.FortuneService;

public class YogaCoach implements Coach {
    private FortuneService fortuneService;

    public YogaCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do some stretching for 10 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
