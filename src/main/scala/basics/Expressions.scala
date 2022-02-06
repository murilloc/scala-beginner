package basics

object Expressions extends App {

  val x = 1 + 2 // expression

  println(x)
  println(2 + 3 * 4)
  println(1 == x)

  var aVariable = 2 //side effects
  aVariable += 3

  /*
    Instruções x Expressões

    Instrução é o que determinamos que o computador faça. (do)
    Expressão é algo que tem um valor ou um tipo. (value)
  */

  // If expression

  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3

  println(aConditionValue)
  println(if (aCondition) 5 else 3)


  /*
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  */

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)


  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "Hello" else "Goodbye"
  }

  val someValue = {
    2 < 3
  }

  println(someValue)

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }

  println(someOtherValue)


}
