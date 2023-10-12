package com.example.springboottutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTutorialApplication {

  @Value("${coach.name}")
  private String coachName;

  @Value("${team.name}")
  private String teamName;

  @GetMapping("/teamName")
  public String getTeamInfo() {
    return "Team Name: " + teamName + "\nCoach Name: " + coachName;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootTutorialApplication.class, args);
  }

  @GetMapping("/hello")
  public String sayHello (@RequestParam(value="myName", defaultValue = "World") String name) {
    return String.format("Hello %s!!", name);
  }

  @GetMapping("/primes")
  public List<Integer> getPrimes (@RequestParam(value="upperBound", defaultValue = "10") int upperBound) {
    List<Integer> primes = new ArrayList<>();

    if (upperBound <= 1) return Collections.emptyList();

    for (int x=1; x<=upperBound; x++) {
      if (x==1 || x==0) continue;
      int flg = 1;
      for (int y=2; y<=x/2; ++y) {
        if (x % y == 0) {
          flg = 0;
          break;
        }
      }
      if (flg == 1) primes.add(x);
    }
    return primes;
  }

}
