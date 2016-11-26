
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

 val queue = new BasicIntQueue
 // queue: BasicIntQueue = BasicIntQueue@75f65e45

 queue.put(10)

 queue.put(20)

 queue.get()
 // res2: Int = 10

 queue.get()
 // res3: Int = 20
 