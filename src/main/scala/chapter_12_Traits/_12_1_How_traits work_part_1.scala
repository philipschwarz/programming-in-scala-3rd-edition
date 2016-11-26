
  trait Philosophical
  {
    def philosophize() =
    {
      println("I consume memory, therefore I am!")
    }
  }

  class Frog extends Philosophical
  {
    override def toString = "green"
  }

  val frog = new Frog
  // frog: Frog = green

  frog.philosophize()
  //I consume memory, therefore I am!

  frog.philosophize
  //I consume memory, therefore I am!

