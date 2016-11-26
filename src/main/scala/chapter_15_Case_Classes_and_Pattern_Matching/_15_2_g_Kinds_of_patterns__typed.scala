
  def generalSize(x: Any) = x match
  {
    case s: String => s.length
    case m: Map[_, _] => m.size
    case _ => -1
  }

  generalSize("abc")
  // res16: Int = 3

  generalSize(Map(1 -> 'a', 2 -> 'b'))
  // res17: Int = 2

  generalSize(math.Pi)
  // res18: Int = -1

  def isIntIntMap(x: Any) = x match
  {
    case m: Map[Int,Int] => true
    case _ => false
  }
  //  <console>:14: warning: non-variable type argument Int in type pattern scala.collection.immutable.Map[Int,Int]
  //    (the underlying of Map[Int,Int]) is unchecked since it is eliminated by erasure
  //    case m:Map[Int,Int] => true
  //    ^
  //    isIntIntMap: (x: Any)Boolean

  isIntIntMap(Map(1 -> 1))
  // res20: Boolean = true

  isIntIntMap(Map("abc" -> "abc"))
  // res21: Boolean = true  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

  // The only exception to the erasue rule is arrays, because they are handled
  // specially in Java as well as in Scala
  // The element type of an array is stored with the array value, so you can
  // pattern match on it

  def isStringArray(x: Any) = x match
  {
    case a: Array[String] => "yes"
    case _ => "no"
  }
  // isStringArray: (x: Any)Any

  val as = Array("abc")
  // as: Array[String] = Array(abc)

  isStringArray(as)
  // res24: String = yes

  val ai = Array(1, 2, 3)
  // ai: Array[Int] = Array(1, 2, 3)

  isStringArray(ai)
  // res25: String = no

