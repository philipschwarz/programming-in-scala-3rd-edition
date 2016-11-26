
  package chapter_10_Composition_and_Inheritance

  abstract class Element {

    def contents: Array[String]

    def height: Int = contents.length

    def width: Int = if (height == 0) 0 else contents(0).length

  }

  // contents as a parametric field
  class ArrayElement(val contents: Array[String]) extends Element

  class LineElement(s: String) extends ArrayElement(Array(s)) {

    override def width = s.length
    override def height = 1

  }

  class Cat {

    val dangerous = false

  }

  class Tiger (

    override val dangerous: Boolean,
    private var age: Int

  ) extends Cat

