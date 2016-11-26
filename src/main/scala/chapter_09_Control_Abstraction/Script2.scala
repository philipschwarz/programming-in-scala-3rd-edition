
  // 9.2 Simplifying client code

  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true
    exists
  }

  assert(! containsNeg(List(1, 2, 3, 4)))

  assert(containsNeg(List(1, 2, -3, 4)))

  def containsNegative(nums: List[Int]): Boolean = nums.exists(_ < 0)

  assert(! containsNegative(List(1, 2, 3, 4)))

  assert(containsNegative(List(1, 2, -3, 4)))

  def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num % 2 == 1)
        exists = true
    exists
  }

  def containsOddNumber(nums: List[Int]): Boolean = nums.exists(_ % 2 == 1)