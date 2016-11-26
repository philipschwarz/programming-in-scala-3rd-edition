
// 6.9 Defining operators

class Rational(n: Int, d: Int) {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString = numer + "/" + denom

  def + (that: Rational): Rational = {
    new Rational(
      (numer * that.denom) + (that.numer * denom),
      denom * that.denom)
  }

  def * (that: Rational): Rational = {
    new Rational((numer * that.numer), denom * that.denom)
  }

  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)
}

val x = new Rational(1, 2)
val y = new Rational(2, 3)

x + y
// -> 7/6

x + x * y
// -> 5/6

(x + x) * y
// -> 2/3

x + (x * y)
// -> 5/6



