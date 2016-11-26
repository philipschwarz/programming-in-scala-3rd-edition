
 var counter = 0
 synchronized{
   // One thread in here at a time
   counter = counter + 1
 }

