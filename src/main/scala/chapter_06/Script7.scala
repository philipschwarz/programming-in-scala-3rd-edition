
// 6.7 Auxiliary constructors

class Rational(n: Int, d: Int) {

  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString = numer + "/" + denom

  def add(that: Rational): Rational = {
    new Rational((numer * that.denom) + (that.numer * denom),
      denom * that.denom)
  }
}

val y = new Rational(3)