import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success}

// Creating the Future:
  //
  // Future.failed
  // Future.successful
  // Future.fromTry
  // Promises

  val futureSuccess = Future.successful{ 21 + 21 }

  futureSuccess.isCompleted
  // -> Boolean = true

  futureSuccess.value
  // -> Option[scala.util.Try[Int]] = Some(Success(42))

  val futureFailure = Future.failed{ new Exception("bummer!") }

  futureFailure.isCompleted
  // -> Boolean = true

  futureFailure.value
  // -> Option[scala.util.Try[Int]] = Some(Failure(java.lang.Exception: bummer!))

  val aFutureSuccess = Future.fromTry( Success{ 21 + 21 } )

  aFutureSuccess.isCompleted
  // -> Boolean = true

  aFutureSuccess.value
  // -> Option[scala.util.Try[Int]] = Some(Success(42))

  val aFutureFailure = Future.fromTry( Failure(new Exception("bummer!")) )

  aFutureFailure.isCompleted
  // -> Boolean = true

  aFutureFailure.value
  // -> Option[scala.util.Try[Int]] = Some(Failure(java.lang.Exception: bummer!))

  val promise = Promise[Int]

  val future = promise.future

  future.value
  // -> Option[Try[Int]]: None

  promise.success(42)

  future.value
  // -> Option[Try[Int]]: Some(Success(42))