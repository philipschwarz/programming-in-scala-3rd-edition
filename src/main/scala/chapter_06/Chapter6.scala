
println("start")

class Rational(n: Int, d: Int) {

  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  override def toString = numer + "/" + denom

  def add(other: Rational): Rational = {
    new Rational((numer * other.denom) + (other.numer * denom),
                  denom * other.denom)
  }

}

val x = new Rational(1, 3)
val y = new Rational(5, 7)

assert("1/3" == x.toString)
assert("5/7" == y.toString)

  assert("22/21" == x.add(y).toString)

