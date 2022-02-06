package basics

object ValueVariablesTypes extends App {

  val x: Int = 42 // val are immutable

  val y = 60 // type inference
  println(x)

  val aString: String = "Hello, this is a string"; // ";" is optional
  val bString = "Outra string";  val cString = "Ainda outra string" //  in this case ";" is  mandatory

  val aBoolean: Boolean = true
  val aChar: Char = 'c'
  val anInt: Int = 50;
  val aShort: Short = 55
  val aLong: Long = 4443546689553435465L
  val aFloat: Float = 4.5f
  val aDouble: Double = 3.14


  // Vars

  var aVariable: Int = 5 // side Effects

}
