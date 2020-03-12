package com.miraenoh.springdemo.config;

import com.miraenoh.springdemo.coach.Coach;
import com.miraenoh.springdemo.coach.YogaCoach;
import com.miraenoh.springdemo.service.FortuneService;
import com.miraenoh.springdemo.service.impl.CrazyFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YogaConfig {
    @Bean
    public FortuneService crazyFortuneService() {
        return new CrazyFortuneService();
    }

    @Bean
    public Coach yogaCoach() {
        return new YogaCoach(crazyFortuneService());
    }
}
