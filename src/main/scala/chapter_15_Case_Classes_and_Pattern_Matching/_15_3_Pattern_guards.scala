
  abstract class Expr

  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

  def simplifyAdd(e: Expr) = e match
  {
    case BinOp("+", x, x) => BinOp("*", x, Number(2))
    case _ => e
  }
  //  <console>:19: error: x is already defined as value x
  //    case BinOp("+", x, x) => BinOp("*", x, Number(2))

  def simplifyAdd2(e: Expr) = e match
  {
    case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
    case _ => e
  }

  val expr = BinOp("+", Var("a"), Var("a"))
  // expr: BinOp = BinOp(+,Var(a),Var(a))

  simplifyAdd2(expr)
  // res27: Expr = BinOp(*,Var(a),Number(2.0))