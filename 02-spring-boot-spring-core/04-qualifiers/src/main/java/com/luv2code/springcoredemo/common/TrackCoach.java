package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component  // marks the class as a Spring Bean
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
