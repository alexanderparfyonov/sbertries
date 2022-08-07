package org.interview

import org.interview.MinimumJumpsProblem.minimumJumps
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSuite, Matchers}

@RunWith(classOf[JUnitRunner])
class MinimumJumpsProblemTest extends FunSuite with Matchers {
  test("Froggest Jump") {
    assert(minimumJumps(Array(14, 4, 18, 1, 15), 3, 15, 9) == 3) // 0 -> 3 -> 6 -> 9
    assert(minimumJumps(Array(8, 3, 16, 6, 12, 20), 15, 13, 11) == -1) // not possible
    assert(minimumJumps(Array(1, 6, 2, 14, 5, 17, 4), 16, 9, 7) == 2) // 0 -> 16 -> 7
    assert(minimumJumps(Array(998), 999, 1000, 1000) == 1998)
  }
}
