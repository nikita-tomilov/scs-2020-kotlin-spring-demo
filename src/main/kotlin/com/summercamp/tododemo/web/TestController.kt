package com.summercamp.tododemo.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/"])
class TestController {

  @GetMapping
  fun test(): String {
    return "Hello World"
  }
}