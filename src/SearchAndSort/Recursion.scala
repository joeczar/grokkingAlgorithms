package SearchAndSort

object Recursion extends App {

  @scala.annotation.tailrec
  def countdown(start: Int): Unit = {
    println(start)
    if (start <= 0) start
    else countdown(start - 1)
  }
  countdown(10)

  def fact(x: Int): Int = {
    if (x == 1) x
    else x * fact(x - 1)
  }

  @scala.annotation.tailrec
  def factTailRec(x: BigInt, acc: BigInt = 1): BigInt = {
    if (x == 0)  acc
    else factTailRec(x - 1, x * acc)
  }
  println(fact(17)) // normal int only makes it to 16
  println(factTailRec(20))
}
