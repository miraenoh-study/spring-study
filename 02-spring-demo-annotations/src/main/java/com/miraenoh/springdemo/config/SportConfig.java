package com.miraenoh.springdemo.config;

import com.miraenoh.springdemo.coach.Coach;
import com.miraenoh.springdemo.coach.SwimCoach;
import com.miraenoh.springdemo.service.FortuneService;
import com.miraenoh.springdemo.service.impl.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
    // Define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // Define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
