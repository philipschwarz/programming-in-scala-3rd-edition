
// 6.4 Checking Preconditions

class Rational(n: Int, d: Int) {
  require(d != 0, "d must be non-zero")
  override def toString = n + "/" + d
}

new Rational(1, 3)
new Rational(5, 0)