package com.example.springboottutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

  private Coach coach;

  @Autowired
  public CoachController (Coach coach) {
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
