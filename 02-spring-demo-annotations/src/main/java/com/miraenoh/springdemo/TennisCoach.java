package com.miraenoh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {
    // DI by field injection
/*    @Autowired
    @Qualifier("happyFortuneService")*/
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> inside default constructor");
    }

    // DI by Autowired random method
/*    @Autowired
    public void doSomeCrazyStuff(@Qualifier("databaseFortuneService") FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        fortuneService = theFortuneService;
    }*/

    // DI by Autowired setter method
/*    @Autowired
    public void setFortuneService(@Qualifier("RESTFortuneService") FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }*/

    // DI by Autowired constructor annotation
    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
