
  abstract class Expr

  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

  val expr = UnOp("abs", UnOp("abs", Number(1)))

  expr match
  {
   case UnOp("abs", e @ UnOp("abs", _)) => e
   case _ =>
  }
  // res0: Any = UnOp(abs,Number(1.0))