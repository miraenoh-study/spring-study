package com.miraenoh.springdemo.coach;

import com.miraenoh.springdemo.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
/*@Scope("prototype")*/
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
    public TennisCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // Define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // Define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
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
