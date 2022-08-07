package org.interview

import org.interview.SplitArrayProblem.splitArray
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSuite, Matchers}

@RunWith(classOf[JUnitRunner])
class SplitArrayProblemTest extends FunSuite with Matchers {

  test("Eat, Pray, Split Array") {
    assert(splitArray(Array(7, 2, 5, 10, 8), 2) == 18)
    assert(splitArray(Array(1, 2, 3, 4, 5), 2) == 9) // [1,2,3] & [4,5]
    assert(splitArray(Array(1, 4, 4), 3) == 4) // [1] & [4] & [4]
    assert(splitArray(Array(5, 6, 4, 9, 8, 3, 9, 3, 6, 6, 7, 5, 9, 9, 3, 5, 4,
      6, 9, 1, 9, 8, 3, 5, 5, 4, 3, 1, 1, 2, 3, 6, 6, 1, 9, 7, 5, 7, 6, 8, 3, 4, 9, 8, 7, 5, 5, 4, 4, 8, 5, 8, 3, 9, 6,
      7, 5, 4, 6, 4, 1, 3, 1, 7, 2, 3, 8, 5, 6, 8, 1, 3, 7, 7, 4, 7, 5, 2, 4, 2, 1, 9, 6, 5, 9, 1, 5, 1, 5, 7, 4, 1, 4,
      5, 7, 3, 6, 8, 1, 2, 1, 6, 5, 4, 5, 8, 8, 9, 8, 2, 3, 8, 3, 8, 1, 8, 5, 1, 8, 7, 7, 8, 7, 4, 7, 1, 2, 4, 2, 2, 3,
      5, 5, 3, 7, 8, 8, 8, 1, 3, 4, 7, 4, 2, 9, 6, 1, 1, 1, 4, 9, 7, 4, 5, 1, 4, 2, 7, 9, 7, 8, 7, 5, 5, 6, 9, 2, 6, 1,
      8, 6, 8, 1, 0, 9, 7, 7, 6, 3, 7, 7, 9, 8, 2, 2, 5, 0, 2, 9, 6, 9, 7, 9, 7, 4, 9, 7, 8, 1, 7, 7), 9) == 118)
  }

}
