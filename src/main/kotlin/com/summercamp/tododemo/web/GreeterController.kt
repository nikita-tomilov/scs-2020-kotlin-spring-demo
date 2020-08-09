package com.summercamp.tododemo.web

import com.summercamp.tododemo.dto.Greeting
import com.summercamp.tododemo.dto.GreetingBody
import com.summercamp.tododemo.service.GreeterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/api/1.0/greeter"])
class GreeterController(
  @Autowired private val service: GreeterService
) {

  @GetMapping("/greetStranger")
  fun greetingForStranger(): Greeting {
    return service.greet()
  }

  @GetMapping("/greet/{target}")
  fun greetingForTarget(
    @PathVariable("target") target: String
  ): Greeting {
    return service.greet(target)
  }

  @PostMapping("/greetWithBody/{target}")
  fun greetingForTargetWithBody(
    @PathVariable("target") target: String,
    @RequestBody body: GreetingBody
  ): Greeting {
    return service.greet(target, body)
  }
}