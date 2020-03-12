package com.miraenoh.springdemo;

import com.miraenoh.springdemo.coach.Coach;
import com.miraenoh.springdemo.config.ScanSportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // Read the spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanSportConfig.class);

        // Get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
