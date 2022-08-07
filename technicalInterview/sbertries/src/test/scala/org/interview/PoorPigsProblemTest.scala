package org.interview

import org.interview.PoorPigsProblem.poorPigs
import org.scalatest.{FunSuite, Matchers}

class PoorPigsProblemTest extends FunSuite with Matchers {
  test("Poor Pigs Lives Matter!") {
    assert(poorPigs(8, 1, 1) == 3)
    assert(poorPigs(1000, 1, 1) == 10)
    assert(poorPigs(27, 5, 15) == 3)
    assert(poorPigs(125, 6, 30) == 3)
  }
}
