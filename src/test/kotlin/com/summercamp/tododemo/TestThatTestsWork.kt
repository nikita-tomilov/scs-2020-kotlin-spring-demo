package com.summercamp.tododemo

import org.junit.Test

class TestThatTestsWork {

  @Test
  fun foo() {
    println("it works")
    assert(true) { "assert is broken" }
  }
}