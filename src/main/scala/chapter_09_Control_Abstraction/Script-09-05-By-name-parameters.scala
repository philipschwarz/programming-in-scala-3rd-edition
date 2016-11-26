import java.util.function.Predicate

var assertionsEnabled = true

  def myAssert(predicate: () => Boolean) =
    if (assertionsEnabled && !predicate())
      throw new AssertionError()

  myAssert( () => 5 > 3 )

  // argument is a by-name parameter
  // we can leave out the () both in the signature and in invocations
  def byNameAssert(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError()

  byNameAssert( 5 > 3 )


  def boolAssert(predicate: Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError()

  val x = 5

  assertionsEnabled = false

  boolAssert( x / 0 == 0 )
  // --> java.lang.ArithmeticException: / by zero

  byNameAssert( x / 0 == 0 )