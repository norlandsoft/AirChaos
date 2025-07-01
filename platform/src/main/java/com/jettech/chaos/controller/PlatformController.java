package com.jettech.chaos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * PlatformController
 * 
 * @author eric.chai
 * @date 2025-07-01
 */
@Slf4j
@RestController
@RequestMapping("/api/platform")
public class PlatformController {
  @GetMapping("/hello")
  public String hello() {
    log.info("Hello, World!");
    return "Hello, World!";
  }
}
