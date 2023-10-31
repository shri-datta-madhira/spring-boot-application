package com.example.springboottutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

  private Coach coach;

  // Constructor Injection
  @Autowired
  public CoachController (@Qualifier("cricketCoach") Coach coach) {
    this.coach = coach;
  }

  // Setter Injection
  @Autowired
  public void setCoach (@Qualifier("footballCoach") Coach coach) {
    this.coach = coach;
  }

  @GetMapping("/getDailyWorkout")
  public String getDailyWorkout() {
    return coach.getDailyWorkout();
  }

  @GetMapping("/getTeamInfo")
  public String getTeamInfo() {
    return coach.getTeamName() + "\n" + coach.getTeamStraregies();
  }

}
