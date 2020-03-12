package com.miraenoh.springdemo.service.impl;

import com.miraenoh.springdemo.service.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
