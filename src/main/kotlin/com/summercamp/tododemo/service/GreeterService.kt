package com.summercamp.tododemo.service

import com.summercamp.tododemo.dto.Greeting
import com.summercamp.tododemo.dto.GreetingBody
import org.springframework.stereotype.Service

@Service
class GreeterService {

  fun greet(): Greeting {
    return Greeting("stranger", "Hello there")
  }

  fun greet(target: String): Greeting {
    return Greeting(target, "Hello, $target")
  }

  fun greet(target: String, body: GreetingBody): Greeting {
    return Greeting(target, body.body)
  }
}