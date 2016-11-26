import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

// Filtering: filter and collect

  val future = Future{ 42 }

  val valid = future.filter(_ > 0)

  assert(Some(Success(42)) == valid.value)

  val invalid = future.filter(_ < 0)

  invalid.value
  // -> Some(Failure(java.util.NoSuchElementException: Future.filter predicate is not satisfied))

  ////////////////////////////////////////////////////////////////////////////////////////////////

  val valid2 = for (result <- future if result > 0) yield result

  assert(Some(Success(42)) == valid2.value)

  val invalid2 = for (result <- future if result < 0) yield result

  invalid2.value
  // -> Some(Failure(java.util.NoSuchElementException: Future.filter predicate is not satisfied))

  ////////////////////////////////////////////////////////////////////////////////////////////////

  val valid3 = future.collect{ case result if result > 0 => result + 46 }

  assert(Some(Success(88)) == valid3.value)

  val invalid3 = future.collect{ case result if result < 0 => result + 46 }

  invalid.value
  // -> Some(Failure(java.util.NoSuchElementException: Future.filter predicate is not satisfied))