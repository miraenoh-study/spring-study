package com.miraenoh.springdemo;

public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice swinging for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
