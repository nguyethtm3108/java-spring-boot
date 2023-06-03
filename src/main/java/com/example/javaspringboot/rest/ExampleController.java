package com.example.javaspringboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
  @GetMapping("/")
  public String sayHello()
  {
    return "Hello Everyone!";
  }
}
