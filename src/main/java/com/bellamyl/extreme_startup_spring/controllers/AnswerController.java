package com.bellamyl.extreme_startup_spring.controllers;

import com.bellamyl.extreme_startup_spring.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

  @Autowired
  private AnswerService answerService;

  @GetMapping(value = "/api/answer")
  public String getData(@RequestParam(name = "q") String query) {
    return answerService.getAnswer(query);
  }
}