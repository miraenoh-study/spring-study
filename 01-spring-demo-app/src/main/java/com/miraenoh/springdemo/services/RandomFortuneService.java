package com.miraenoh.springdemo.services;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private List<String> fortuneMessages = Arrays.asList("Today is your lucky day!", "Today is your bad day!", "Today is your ordinary day!");

    @Override
    public String getFortune() {
        return fortuneMessages.get(new Random().nextInt(fortuneMessages.size()));
    }
}
