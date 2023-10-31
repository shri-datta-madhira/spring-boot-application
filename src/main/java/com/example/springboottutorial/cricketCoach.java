package com.example.springboottutorial;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Practice defense and fielding.";
  }

  @Override
  public String getTeamName() {
    return "India";
  }

  @Override
  public String getTeamStraregies() {
    return "Bowl first and chase the score.";
  }
}
