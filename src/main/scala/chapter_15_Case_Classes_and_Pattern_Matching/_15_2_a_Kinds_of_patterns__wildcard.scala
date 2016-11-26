
  abstract class Expr

  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

  val expr: Expr = BinOp("+",Number(1.0),Var("x"))

  expr match {
    case BinOp(op, left, right) => println(expr + " is a binary operation")
    case _ =>  // handle the default case (by doing nothing)
  }
  // BinOp(+,Number(1.0),Var(x)) is a binary operation

  val expr1: Expr = Var("x")

  expr1 match {
    case BinOp(_, b, c) => println(expr1 + " is a binary operation")
    case _ => println("It's something else")
  }
  // It's something else


