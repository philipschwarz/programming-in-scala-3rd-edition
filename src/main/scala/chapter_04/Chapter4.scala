
class ChecksumCalculator0 {

  var sum = 0

}

val acc01 = new ChecksumCalculator0
val acc02 = new ChecksumCalculator0

acc01.sum = 3


class ChecksumCalculator {

  private var sum = 0

  def add(b:Byte): Unit = {
    sum = sum + b
  }

}

val acc = new ChecksumCalculator

// Does not compile
// acc.sum = 3