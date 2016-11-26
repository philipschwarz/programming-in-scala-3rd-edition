
  val expr = 1

  expr match {
    case 0 => "zero"
    case somethingElse => "not zero: " + somethingElse
  }
  // res0: String = not zero: 1

  import math.{E, Pi}

  E match {
    case Pi => "strange math? Pi = " + Pi
    case _ => "OK"
  }
  // res1: String = OK

  val pi = math.Pi

  E match {
    case pi => "strange math? Pi = " + pi
  }
  // res10: String = strange math? Pi = 2.718281828459045

  E match {
    case pi => "strange math? Pi = " + pi
    case _ => "OK"
  }
  // <console>:16: warning: unreachable code
  //   case _ => "OK"

  E match {
    case `pi` => "strange math? Pi = " + pi
    case _ => "OK"
  }
  // res18: String = OK



