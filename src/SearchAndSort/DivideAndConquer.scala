package SearchAndSort

object DivideAndConquer extends App {

  @scala.annotation.tailrec
  def sum(list: Seq[Int], acc: Int = 0): Int =
    if (list.isEmpty) acc
    else sum(list.tail, list.head + acc)

  val aList = List(1,2,3,4,5)
  println(sum(aList))

  @scala.annotation.tailrec
  def findLength(list: Seq[Int], count: Int = 0): Int =
    if (list.isEmpty) count
    else findLength(list.tail, count + 1)

  println(findLength(aList))

  @scala.annotation.tailrec
  def max(list: Seq[Int], biggest: Int = 0): Int =
    if (list.isEmpty) biggest
    else {
      if (list.head > biggest) max(list.tail, list.head)
      else max(list.tail, biggest)
    }
  def maxPM(list: Seq[Int], biggest: Int = 0): Int = list match {
    case list if list.isEmpty => biggest
    case x :: xs  if x > biggest => maxPM(xs, x)
    case _ :: xs => maxPM(xs, biggest)
  }
  println(max(aList))
  println(maxPM(aList))
}
