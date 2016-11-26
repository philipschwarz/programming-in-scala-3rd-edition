
  def describe(x: Any) = x match
  {
    case 5        => "five"
    case true     => "true"
    case "hello"  => "hi!"
    case Nil      => "the empty list"
    case _        => "something else"
  }

  describe(5)
  // res0: String = five

  describe(true)
  // res1: String = true

  describe("hello")
  // res2: String = hi!

  describe(Nil)
  // res3: String = the empty list

  describe(List(1,2,3))
  // res4: String = something else