
// 6.5 Adding fields

class Rational(n: Int, d: Int) {

  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  override def toString = numer + "/" + denom

  def add(that: Rational): Rational = {
    new Rational((numer * that.denom) + (that.numer * denom),
                 denom * that.denom)
  }

}

val oneHalf = new Rational(1, 2)

val twoThirds = new Rational(2, 3)

oneHalf add twoThirds

val r = new Rational(1,2)

r.numer

r.denom

println(oneHalf add twoThirds)
