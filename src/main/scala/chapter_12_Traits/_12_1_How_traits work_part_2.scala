
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
  }