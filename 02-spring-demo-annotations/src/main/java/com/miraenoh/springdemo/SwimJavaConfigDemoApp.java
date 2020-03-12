package com.miraenoh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // Read the spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //  Call getters on the bean
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

        // Close the context
        context.close();
    }
}
