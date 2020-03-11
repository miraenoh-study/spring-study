package com.miraenoh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        // Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "beanLifeCycle-applicationContext.xml");

        // retrieve beans from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // Close the context
        context.close();
    }
}
