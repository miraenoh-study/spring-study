package com.miraenoh.springdemo.service.impl;

import com.miraenoh.springdemo.service.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Some fortune from DB";
    }
}
