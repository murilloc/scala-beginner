package basics

import scala.annotation.tailrec

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3));

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  // Scala 2
  // println(aParameterlessFunction)

  def anAnotherParameterlessFunction: Int = {
    42 + 54 * 12
  }

  println(anAnotherParameterlessFunction)

  def aRepeaterFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeaterFunction(aString, n - 1)

  }

  println(aRepeaterFunction("Hello", 3)) // HelloHelloHello

  def aFunctionWithSideEffect(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  /*
  1. Greeting function (name, age) => "Hi, my name is $name and I am $age years old"
  2. Factorial function  n x (n - 1) x (n - 2) ... x 3 x 2 x 1
  3 A fibonacci function
    f(1) = 1
    f(2) = 1
    f(n) = f(n-1) + f(n-2)
  4. Test if a number is prime
  */

  //1

  def aGreetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }

  println(aGreetingFunction("Murillo", 55))




  //2

  def aFactorialFunction(n: Int): Int =
    if (n <= 1) 1
    else n * aFactorialFunction(n - 1)


  println(aFactorialFunction(5))


  //3
  def aFibonacciFunction(n: Int): Int =
    if (n <= 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)

  println(aFibonacciFunction(8))


  // 4
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(11))
}
