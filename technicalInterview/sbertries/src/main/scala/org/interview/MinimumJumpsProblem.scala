package org.interview

import scala.collection.mutable.{HashSet, Queue}

object MinimumJumpsProblem {

  def minimumJumps(forbidden: Array[Int], a: Int, b: Int, x: Int): Int = {
    if (x == 0) return 0
    if (x < 0) return -1
    if (x == a) return 1
    var step = 0
    val forbiddenSet = forbidden.toSet
    val limit = x + 6 * Math.max(a, b)
    val queue = Queue[Data]()
    val isVisited = HashSet[Data]()
    queue enqueue Data(0)
    while (!queue.isEmpty) {
      val queueSize = queue.size
      (0 until queueSize) foreach (_ => {
        val current = queue.dequeue()
        if (current.idx == x) return step
        if (!isVisited.contains(current)) {
          isVisited add current
          if (!isVisited.contains(Data(current.idx + a)) && current.idx + a <= limit && !forbiddenSet.contains(current.idx + a))
            queue enqueue Data(current.idx + a)
          if (current.forward && !isVisited.contains(Data(current.idx - b, false)) && current.idx - b >= 0 && !forbiddenSet.contains(current.idx - b))
            queue enqueue Data(current.idx - b, false)
        }
      })
      step += 1
    }
    -1
  }
}

case class Data(idx: Int, forward: Boolean = true)
