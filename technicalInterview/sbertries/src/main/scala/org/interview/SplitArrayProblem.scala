package org.interview

/**
 * @author ${user.name}
 */
object SplitArrayProblem {
  def splitArray(nums: Array[Int], m: Int): Int = {
    def canSplit(sumLimit: Int) =
      nums
        .foldLeft((1, 0)) {
          case ((subarrayCount, currentSum), n) =>
            if (currentSum + n <= sumLimit) (subarrayCount, currentSum + n)
            else (subarrayCount + 1, n)
        }
        ._1 <= m

    def binarySearch(left: Int, right: Int): Int =
      if (left >= right) left
      else {
        val mid = left + (right - left) / 2
        if (canSplit(mid)) binarySearch(left, right = mid)
        else binarySearch(left = mid + 1, right)
      }

    binarySearch(left = nums.max, right = nums.sum)
  }
}
