
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future

  val future = Future{ Thread.sleep(10000); 21 + 21 }

  println("future.isCompleted = " + future.isCompleted)
  // -> false

  println("future.value = " + future.value)
  // -> Option[scala.util.Try[Int]] = None

  Thread.sleep(10000)

  println("future.isCompleted = " + future.isCompleted)
  // -> true

  println("future.value = " + future.value)
  // -> Option[scala.util.Try[Int]] = Some(Success(42))