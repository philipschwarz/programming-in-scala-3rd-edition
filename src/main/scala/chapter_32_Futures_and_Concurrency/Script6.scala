  // Transforming Futures with for map

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  val future1: Future[Int] = Future{ Thread.sleep(10000); 21 + 21 }

  val future2: Future[Int] = Future{ Thread.sleep(10000); 23 + 23 }

  val sum: Future[Int] = for {
    x <- future1
    y <- future2
  } yield x + y

  println("future1.isCompleted = " + future1.isCompleted)
  // -> false
  println("future2.isCompleted = " + future2.isCompleted)
  // -> false
  println("sum.isCompleted = " + sum.isCompleted)
  // -> false
  println("future1.value = " + future1.value)
  // -> Option[scala.util.Try[Int]] = None
  println("future2.value = " + future2.value)
  // -> Option[scala.util.Try[Int]] = None
  println("sum.value = " + sum.value)
  // -> Option[scala.util.Try[Int]] = None

  Thread.sleep(10000)

  println("future1.isCompleted = " + future1.isCompleted)
  // -> true
  println("future2.isCompleted = " + future2.isCompleted)
  // -> true
  println("sum.isCompleted = " + sum.isCompleted)
  // -> true
  println("future1.value = " + future1.value)
  // -> Option[scala.util.Try[Int]] = Some(Success(42))
  println("future2.value = " + future2.value)
  // -> Option[scala.util.Try[Int]] = Some(Success(46))
  println("sum.value = " + sum.value)
  // -> Option[scala.util.Try[Int]] = Some(Success(88))



