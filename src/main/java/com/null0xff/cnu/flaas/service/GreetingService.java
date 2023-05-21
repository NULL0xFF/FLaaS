package com.null0xff.cnu.flaas.service;

import java.text.SimpleDateFormat;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

  public String generateGreeting() {
    String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(
        System.currentTimeMillis());
    return "Greeting from FLaaS server with time  " + currentTime;
  }
}
