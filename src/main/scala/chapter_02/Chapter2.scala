
  // scala src/main/scala/chapter_01/Chapter1.scala Philip

  ///////////////////////////////////////////////////
  // Step 1. Learn to use the Scala interpreter
  ///////////////////////////////////////////////////

  println("Hello, world!")

  ///////////////////////////////////////////////////
  // Step 2. Define some variables
  ///////////////////////////////////////////////////

  val msg = "Hello, world!"

  val msg2: java.lang.String = "Hello again, world!"

  val msg3: String = "Hello again, world!"

  println(msg)

  var greeting = "Hello, World!"
  greeting = "Leave me alone, World!"

  // self: begin explore

      // String.split
      println("Hello, World!".split(" ")(0))
      // Hello,

      println("Hello, World!".split(" ")(1))
      // World!

      // StringOps.map
      println("abcd".map(_.toInt))
      // Vector(97, 98, 99, 100)

      println("abcd".map(_.toInt.+(1).toChar))
      // bcde

      // StringOps.filter
      println("abcd".filter(_ == 'b'))
      // b

      println("abcd".filter(_ != 'b'))
      // acd

      println("abcd".filter(_.toInt > 98))
      // cd

      // StringOps methods like filter returns a String
      val s:String = "abcd"
      s.filter(_.toInt > 98)
      // res1: String = cd

      // WrappedString methods like filter return a WrappedString
      val ws: scala.collection.immutable.WrappedString = "abcd"
      ws.filter(_.toInt > 98)
      // res0: scala.collection.immutable.WrappedString = cd

      "abcd".find(_ == 'b').map(_.+(1).toChar)
      // Option[Char] = Some(c)

      "abcd".find(_ == 'z').map(_.+(1).toChar)
      // Option[Char] = None

      "abcd".find(_ == 'b').map(_.+(1).toChar).getOrElse('?')
      // Char = c

      "abcd".find(_ == 'z').map(_.+(1).toChar).getOrElse('?')
      // Char = ?

      println("abcd".foreach(println))
      // a
      // b
      // c
      // d
      // ()

      println("abcd".filter(_.toInt == 126))



  // self: end explore

  ///////////////////////////////////////////////////
  // Step 3. Define some functions
  ///////////////////////////////////////////////////

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }
  // max: (x: Int, y: Int)Int

  def max2(x: Int, y: Int): Int = if (x > y) x else y

  def max3(x: Int, y: Int) = if (x > y) x else y

  max(3, 5)

  def greet() = println("Hello, World!")
  // -> greet: ()Unit

  ///////////////////////////////////////////////////
  // Step 4. Write some Scala scripts
  ///////////////////////////////////////////////////

  println("Hello, world, from a script!")

  println("Hello, "+ args(0) +"!")

  ///////////////////////////////////////////////////
  // Step 5. Loop with while; decide with if
  ///////////////////////////////////////////////////

  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }

  i = 0
  while (i < args.length) {
    if (i != 0)
      print(" ")
    print(args(i))
    i += 1
  }
  println()

  ///////////////////////////////////////////////////
  // Step 6. Iterate with foreach and for
  ///////////////////////////////////////////////////

  args.foreach(arg => println(arg))

  args.foreach((arg: String) => println(arg))

  args.foreach(println)

  // self: begin explore

      args.foreach(println _)

      args.foreach(println(_))

      def factorial(n: Int): Int = {
        if (n == 0) 1
        else n * factorial(n - 1)
      }
      // fac: (n: Int)Int

      val f = factorial _
      // f: Int => Int = <function1>

      val g = factorial(_)
      // g: Int => Int = <function1>

      val h: Int => Int = factorial
      // h: Int => Int = <function1>

      def increment(n: Int) = n + 1

      val fn: Int => Int = if (args.length > 3) factorial else increment
      println(fn(10))

      def incrementBy(n: Int)(m: Int) = m + n
      val plus3: Int => Int = incrementBy(3)
      println(plus3(4))

  // self: end explore

  for(arg <- args)
    println(arg)






