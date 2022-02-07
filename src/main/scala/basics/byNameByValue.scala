package basics

object byNameByValue extends App {

  // By Value
  def callByValue(x: Long): Unit = {
    printf("By value: %d\n", x)
    printf("By value: %d\n", x)
  }


  // By Name
  def callByName(x: => Long): Unit = {
    printf("By name: %d\n", x)
    printf("By name: %d\n", x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())


  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(), 34)  stack overflow
  printFirst(34, infinite());  // Lazy evaluation


}
