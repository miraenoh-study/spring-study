package com.miraenoh.springdemo.service.impl;

import com.miraenoh.springdemo.service.FortuneService;

public class CrazyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Your luck is just crazy today!";
    }
}
