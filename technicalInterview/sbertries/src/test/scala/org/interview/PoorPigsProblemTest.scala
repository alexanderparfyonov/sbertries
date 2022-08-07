package org.interview

import org.interview.PoorPigsProblem.poorPigs
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.{FunSuite, Matchers}

@RunWith(classOf[JUnitRunner])
class PoorPigsProblemTest extends FunSuite with Matchers {
  test("Poor Pigs Lives Matter!") {
    assert(poorPigs(8, 1, 1) == 3)
    assert(poorPigs(1000, 1, 1) == 10)
    assert(poorPigs(27, 5, 15) == 3)
    assert(poorPigs(125, 6, 30) == 3)
  }
}
