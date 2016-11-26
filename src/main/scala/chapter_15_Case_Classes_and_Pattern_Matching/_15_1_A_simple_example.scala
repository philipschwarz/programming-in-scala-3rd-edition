
  abstract class Expr

  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

  val v = Var("x")
  // v: Var = Var(x)

  val op = BinOp("+", Number(1), v)
  // op: BinOp = BinOp(+,Number(1.0),Var(x))

  v.name
  // res0: String = x

  op.left
  // res1: Expr = Number(1.0)

  println(op)
  // BinOp(+,Number(1.0),Var(x))

  op.right == Var("x")
  // res3: Boolean = true

  op.copy(operator = "-")
  // res4: BinOp = BinOp(-,Number(1.0),Var(x))

  def simplifyTop(expr: Expr): Expr = expr match
  {
    case UnOp("-", UnOp("-", e))  => e // Double negative
    case BinOp("+", e, Number(0)) => e // Adding zero
    case BinOp("*", e, Number(1)) => e // Multiplying by one
    case _ => expr
  }

  simplifyTop(UnOp("-", UnOp("-", Var("x"))))
  // res5: Expr = Var(x)


