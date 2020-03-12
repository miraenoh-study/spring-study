package com.miraenoh.springdemo.service.impl;

import com.miraenoh.springdemo.service.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    // Create an array of strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        // Pick a random string from the array
        int index = random.nextInt(data.length);

        return data[index];
    }
}
