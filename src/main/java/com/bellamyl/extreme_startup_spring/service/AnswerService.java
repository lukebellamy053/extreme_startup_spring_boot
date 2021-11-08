package com.bellamyl.extreme_startup_spring.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

  public String getAnswer(String query) {
    Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(query);
    if (sumMatcher.matches()) {
      return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
    }
    return query;
  }

}
