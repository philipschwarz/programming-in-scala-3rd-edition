
  // 9.3 Currying

  // scala> :load src/main/scala/chapter_09/Script3.scala

  def plainOldSum(x: Int, y: Int) = x + y

  assert( 3 == plainOldSum(1, 2) )

  def curriedSum(x: Int)(y: Int) = x + y

  assert( 3 == curriedSum(1)(2) )


  def first(x: Int) = (y: Int) => x + y

  val second = first(1)

  assert( 3 == second(2) )


  // _ is a placeholder for curriedSum's second parameter list
  val onePlus = curriedSum(1)_

  assert( 3 == onePlus(2) )

  val twoPlus = curriedSum(2)_

  assert( 4 == twoPlus(2) )



