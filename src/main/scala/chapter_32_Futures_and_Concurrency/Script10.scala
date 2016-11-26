
  import scala.concurrent.Future
  import scala.util.{Failure, Success}
  import scala.concurrent.ExecutionContext.Implicits.global

  // Dealing with failure: failed, fallBackTo, recover and recoverWith

  val failure: Future[Int] = Future{ 42 / 0 }

  failure.value
  // -> Some(Failure(java.lang.ArithmeticException: / by zero))

  val expectedFailure: Future[Throwable] = failure.failed
  // -> Success(java.lang.ArithmeticException: / by zero)

  expectedFailure.value
  // -> Some(Success(java.lang.ArithmeticException: / by zero))

  // ... WIP ...