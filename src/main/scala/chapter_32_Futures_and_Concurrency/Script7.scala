

// Transforming Futures with for map

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


val sum: Future[Int] = for {
  x <- Future{ Thread.sleep(10000); 21 + 21 }
  y <- Future{ Thread.sleep(10000); 23 + 23 }
} yield x + y

println("sum.isCompleted = " + sum.isCompleted)
// -> false
println("sum.value = " + sum.value)
// -> Option[scala.util.Try[Int]] = None

Thread.sleep(10000)

println("sum.isCompleted = " + sum.isCompleted)
// -> false
println("sum.value = " + sum.value)
// -> Option[scala.util.Try[Int]] = None

Thread.sleep(10000)

println("sum.isCompleted = " + sum.isCompleted)
// -> true
println("sum.value = " + sum.value)
// -> Option[scala.util.Try[Int]] = Some(Success(88))