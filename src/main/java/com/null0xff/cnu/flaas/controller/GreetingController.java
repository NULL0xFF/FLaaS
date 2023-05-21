package com.null0xff.cnu.flaas.controller;

import com.null0xff.cnu.flaas.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
@RequiredArgsConstructor
public class GreetingController {

  private final GreetingService greetingService;

  @GetMapping
  public String getGreeting() {
    return greetingService.generateGreeting();
  }
}
