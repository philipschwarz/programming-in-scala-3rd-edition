
  class Rational(n: Int, d: Int) extends Ordered[Rational]
  {
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

    /////////////////////////////////
    // Above code is from chapter 6
    /////////////////////////////////

    def compare(that: Rational) = (this.numer * that.denom) - (that.numer * this.denom)
  }

  val threeQuarters = new Rational(3, 4)
  // threeQuarters: Rational = 3/4

  val fourThirds = new Rational(4, 3)
  // fourThirds: Rational = 4/3

  threeQuarters < fourThirds
  // res1: Boolean = true

  threeQuarters <= fourThirds
  // res2: Boolean = true

  fourThirds < threeQuarters
  // res3: Boolean = false

  fourThirds <= threeQuarters
  // res4: Boolean = false
