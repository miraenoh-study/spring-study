package com.miraenoh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // Read the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
