object week22 {

  class Rational(x: Int, y: Int) {

    require(y > 0, "Denominator must be non-zero.")

    def this(x: Int) = this(x, 1)

    private def gcd(a: Int, b:Int): Int = if(b == 0) a else gcd(b, a % b)
    private val g = gcd(x, y)
    val numer = x / g
    val denom = y / g

    def less(that: Rational) = this.numer * that.denom < that.numer * this.denom
    def max(that: Rational) = if(this.less(that)) that else this

    def add(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def sub(that: Rational) =
      add(that.neg)

    def neg: Rational =
      new Rational(-1 * numer, denom)

    override def toString = numer + "/" + denom
  }

  // =============== Testing Space ========== //
  val num1 = new Rational(1, 2)
  val num2 = new Rational(2, 3)
  val num3 = new Rational(3, 4)

  num1.sub(num2).sub(num3)
  num1.less(num2)
  num2.max(num3)

  //val num4 - new Rational(1, 0)
}

