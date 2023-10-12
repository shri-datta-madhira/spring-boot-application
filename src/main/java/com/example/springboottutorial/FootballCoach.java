package com.example.springboottutorial;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Passing for Midfielders, Passing and crossing for wingers and flexibility training";
  }

  @Override
  public String getTeamName() {
    return "F C Barcelona";
  }

  @Override
  public String getTeamStraregies() {
    return "Possession, High Press, and Attacking";
  }
}
