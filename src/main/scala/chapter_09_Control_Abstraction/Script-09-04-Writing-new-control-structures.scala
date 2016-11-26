import java.io.{File, PrintWriter}

// 9.4 Writing new control structures

  def twice(op: Double => Double, x: Double) = op(op(x))

  assert( 7.0 == twice( _ + 1, 5) )


  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  withPrintWriter(
    new File("date.txt"),
    writer => writer.println(new java.util.Date)
  )



  println("Hello World!")

  println{ "Hello World!" }


  // Using the loan pattern to write to a file
  def withPrintWriter2(file: File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  val file = new File("date.txt")

  withPrintWriter2(file) { writer =>
    writer.println(new java.util.Date)
  }



