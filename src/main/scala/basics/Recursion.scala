package basics

import scala.annotation.tailrec

object Recursion extends App {


  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      printf("Computing factorial of %d - I first need factorial of %d\n", n, n - 1)
      val result = n * factorial(n - 1)
      printf("Computed factorial of %d\n", n)
      result
    }

  println(factorial(10))
  // println(factorial(5000)) // stack overflow

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // Tail Recursion => uses recursive call as the LAST expression

    factHelper(n, 1)
  }

  def aFactorialFunction(n: Int): Int =
    if (n <= 1) 1
    else n * aFactorialFunction(n - 1)

  /*
  anotherFactorial(10) = factHelper(10,1)
  = factHelper(9, 10 * 1)
  = factHelper(8,9 * 10 * 1)
  = factHelper(7, 8 * 9 * 10 * 1)
  = factHelper(6 ,7 * 8 * 9 * 10 * 1)
  = ...
  = factHelper(2, 3, 4 ,* .... * 8,9 * 10 * 1)
  = 1 * 2 * 3 * 4 * .... 10
  */

  println(anotherFactorial(50))

  // When you need loops, use Tail Recursion

  /*
  1. concatenate a string n times
  2. IsPrime function tail recursive
  3. Fibonacci function, tail recursive
  */


  //1
  def stringConcatFunction(n: Int, string: String): String = {
    @tailrec
    def concatHelper(x: Int, accumulator: String): String =
      if (x <= 1) accumulator
      else concatHelper(x - 1, string + accumulator)

    concatHelper(n, string)
  }

  println(stringConcatFunction(5, "Test"))

  //2
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(11))

  def isPrime2(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else n % t != 0 && isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)
  }

  println(isPrime2(48))


  //3
  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)

  }

  println(fibonacci(8))


}
