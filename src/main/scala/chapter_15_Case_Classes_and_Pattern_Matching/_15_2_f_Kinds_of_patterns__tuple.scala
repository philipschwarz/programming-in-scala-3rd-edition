
  val expr = ("a ", 3, "-tuple")

  expr match {
    case (a, b, c) => println("matched " + a + b + c)
    case _ =>
  }
  // matched a 3-tuple