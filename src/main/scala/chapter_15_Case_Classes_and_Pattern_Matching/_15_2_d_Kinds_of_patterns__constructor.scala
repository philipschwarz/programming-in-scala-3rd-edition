
  abstract class Expr

  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

  val expr = BinOp("+", Var("a"), Number(0))

  expr match {
    case BinOp("+", e, Number(0)) => println("a deep match")
    case _ =>
  }
  // a deep match