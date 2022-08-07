package org.interview

object PoorPigsProblem {
  def poorPigs(buckets: Int, minutesToDie: Int, minutesToTest: Int): Int = {
    val states = minutesToTest / minutesToDie + 1
    Math.ceil(Math.log(buckets) / Math.log(states)).toInt
  }
}
