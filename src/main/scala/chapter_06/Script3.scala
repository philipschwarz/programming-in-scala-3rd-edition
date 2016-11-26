
// 6.3 Reimplementing the toString method

class Rational(n: Int, d: Int) {
  override def toString = n + "/" + d
}

new Rational(1, 3)
new Rational(5, 7)