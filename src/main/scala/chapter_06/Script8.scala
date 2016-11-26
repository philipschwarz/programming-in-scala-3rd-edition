
// 6.8 Private fields and methods

class Rational(n: Int, d: Int) {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString = numer + "/" + denom

  def add(that: Rational): Rational = {
    new Rational((numer * that.denom) + (that.numer * denom),
      denom * that.denom)
  }

  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)
}

new Rational(66, 42)
// -> 66/42