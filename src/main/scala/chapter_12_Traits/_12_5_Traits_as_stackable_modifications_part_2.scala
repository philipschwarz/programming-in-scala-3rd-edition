
  abstract class IntQueue
  {
    def get(): Int
    def put(x: Int)
  }

  import scala.collection.mutable.ArrayBuffer

  class BasicIntQueue extends IntQueue
  {
    private val buffer = new ArrayBuffer[Int]()

    def get(): Int = buffer.remove(0)
    def put(x: Int): Unit = buffer += x
  }

  trait Doubling extends IntQueue
  {
    abstract override def put(x: Int) = { super.put(2 * x) }
  }

  /////////////////////////////////////////////////////

  class MyQueue extends BasicIntQueue with Doubling

  val queue = new MyQueue
  // queue: MyQueue = MyQueue@3c3820bb

  queue.put(10)

  queue.get()
  // res1: Int = 20

  val queue2 = new BasicIntQueue with Doubling
  // queue2: BasicIntQueue with Doubling = $anon$1@44784e2f

  trait Incrementing extends IntQueue
  {
    abstract override def put(x: Int) = { super.put(x + 1)  }
  }

  trait Filtering extends IntQueue
  {
    abstract override def put(x: Int) = if (x >= 0) super.put(x)
  }

  val queue3 = (new BasicIntQueue with Incrementing with Filtering)
  // queue: BasicIntQueue with Incrementing with Filtering = $anon$1@1a2ac487

  queue3.put(-1); queue.put(0); queue.put(1)

  queue3.get()
  // res1: Int = 1

  queue3.get()
  // res2: Int = 2

  val queue4 = (new BasicIntQueue with Filtering with Incrementing)
  //queue: BasicIntQueue with Filtering with Incrementing = $anon$1@1e92c3b6
  
  queue4.put(-1); queue4.put(0); queue4.put(1)

  queue4.get()
  // res10: Int = 0

  queue4.get()
  // res11: Int = 1

  queue4.get()
  // res12: Int = 2