package com.pink.crypto;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/cesar")
  public Cesar cesar(@RequestParam int offset, @RequestParam(defaultValue = "Test") String text) {
    return new Cesar(counter.incrementAndGet(), text, offset);
  }
}