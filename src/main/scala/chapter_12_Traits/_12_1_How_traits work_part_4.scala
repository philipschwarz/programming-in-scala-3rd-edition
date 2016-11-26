
  trait Philosophical
  {
    def philosophize() =
    {
      println("I consume memory, therefore I am!")
    }
  }

  class Animal

  class Frog extends Animal with Philosophical
  {
    override def toString = "green"
    override def philosophize() =
    {
      println("It ain't easy being " + toString + "!")
    }
  }

  val phrog = new Frog
  // phrog: Philosophical = green

  phrog.philosophize()
  // It ain't easy being green!