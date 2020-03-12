package com.miraenoh.springdemo.service.impl;

import com.miraenoh.springdemo.service.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
