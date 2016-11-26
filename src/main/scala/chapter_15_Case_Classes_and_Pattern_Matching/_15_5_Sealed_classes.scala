
  sealed abstract class Expr

  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

  def describe(e: Expr): String = e match
  {
    case Number(_) => "a number"
    case Var(_)    => "a variable"
  }
  //  <console>:17: warning: match may not be exhaustive.
  //    It would fail on the following inputs: BinOp(_, _, _), UnOp(_, _)
  //    def describe(e: Expr): String = e match

  def describe2(e: Expr): String = e match
  {
    case Number(_) => "a number"
    case Var(_)    => "a variable"
    case _ => throw new RuntimeException // Should not happen
  }

  def describe3(e: Expr): String = (e: @unchecked) match
  {
    case Number(_) => "a number"
    case Var(_)    => "a variable"
  }

