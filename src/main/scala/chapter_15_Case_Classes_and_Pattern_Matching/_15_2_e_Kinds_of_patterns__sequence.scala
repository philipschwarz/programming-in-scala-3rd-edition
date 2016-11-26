
  val expr = List(0, 1, 2)

  expr match {
    case List(0, _, _) => println("found it")
    case _ =>
  }
  // found it

  expr match {
    case List(0, _*) => println("found it")
    case _ =>
  }
  // found it