import java.math.BigInteger

///////////////////////////////////////////////////////////////////////////
println("// Step 7. Parameterize arrays with types ////////////////////////")
///////////////////////////////////////////////////////////////////////////

val big = new BigInteger("12345")

val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "World!\n"
for (i <- 0 to 2)
  print(greetStrings(i))

val greetStrings3: Array[String] = new Array[String](3)

assert( greetStrings(2) == greetStrings.apply(2) )

assert( (1 to 2) == 1.to(2))
assert( (1 to 2) == Range.inclusive(1, 2))

assert( 1 + 2 == 1.+(2) )

val greetStrings2 = new Array[String](3)
greetStrings.update(0, "Hello")
greetStrings.update(1, ", ")
greetStrings.update(2, "World!\n")
for (i <- 0.to(2))
  print(greetStrings.apply(i))

val numNames = Array("zero", "one", "two")

val numNames2 = Array.apply("zero", "one", "two")

///////////////////////////////////////////////////////////////////////////
println("// Step 8. Use lists          ////////////////////////////////////")
///////////////////////////////////////////////////////////////////////////

val oneTwoThree = List(1, 2, 3)

// apply factory method
assert( List(1, 2, 3) == List.apply(1, 2, 3))

// concatenation method :::
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + "is a new list.")

assert( List(1, 2) ::: List(3, 4) == List(3, 4).:::(List(1, 2)))
assert( List(1, 2) ::: List(3, 4) == List(1, 2, 3, 4))

// cons method ::
val twoThree = List(2, 3)
val oneTwoThree2 = 1 :: twoThree
println(oneTwoThree2)
assert(oneTwoThree2 == List(1, 2, 3))
assert( 1 :: twoThree == twoThree.::(1))

val oneTwoThree3 = 1 :: 2 :: 3 :: Nil
println(oneTwoThree3)
assert( 1 :: 2 :: 3 :: Nil == Nil.::(3).::(2).::(1))

// The append method is :+ but it is rarely used
assert( List(1, 2, 3, 4) == List(1, 2, 3) :+ 4)
assert( List(1, 2, 3, 4) == (4 :: 3 :: 2 :: 1 :: Nil).reverse)

///////////////////////////////////////////////////////////////////////////
println("// Step 9. Use tuples          //////////////////////////////////")
///////////////////////////////////////////////////////////////////////////



///////////////////////////////////////////////////////////////////////////
println("// Step 10. Use sets and maps ////////////////////////////////////")
///////////////////////////////////////////////////////////////////////////

var set = Set("John","Jane")
// set: scala.collection.immutable.Set[String] = Set(John, Jane)
var set2 = set
// set2: scala.collection.immutable.Set[String] = Set(John, Jane)

set += "Jim"

println(set)
// Set(John, Jane, Jim)   !!!!! It has assigned a new Set to the variable
println(set2)
// Set(John, Jane)
println(set + "Jude")
// Set(John, Jane, Jim, Jude)

val aSet = Set("John","Jane")
// aSet += "Jim"   error: value += is not a member of scala.collection.immutable.Set[String]


