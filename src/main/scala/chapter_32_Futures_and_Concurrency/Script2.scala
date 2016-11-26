
 import scala.concurrent.Future

 val future = Future{ Thread.sleep(10000); 21 + 21 }

 /*
      -->
      error: Cannot find an implicit ExecutionContext. You might pass
      an (implicit ec: ExecutionContext) parameter to your method
      or import scala.concurrent.ExecutionContext.Implicits.global.
      val future = Future{ Thread.sleep(10000); 21 + 21 }

  */
