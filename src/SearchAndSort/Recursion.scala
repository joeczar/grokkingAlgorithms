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
    else x * fact(x + 1)
  }
}
