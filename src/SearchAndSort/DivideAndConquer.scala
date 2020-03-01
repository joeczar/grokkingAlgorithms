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
  @scala.annotation.tailrec
  def maxPM(list: Seq[Int], biggest: Int = 0): Int = list match {
    case list if list.isEmpty => biggest
    case x :: xs  if x > biggest => maxPM(xs, x)
    case _ :: xs => maxPM(xs, biggest)
  }
  println(max(aList))
  println(maxPM(aList))

  def quickSort(arr: Seq[Int]): Seq[Int] = {
    if (arr.length < 2) arr
    else {
      val pivot = arr(0)
      val less = arr.filter(x => x < pivot)
      val greater = arr.filter(x => x > pivot)
      quickSort(less) :+ pivot :++ quickSort(greater)
    }
  }
  println(quickSort(Vector(10, 5, 2, 3, 6, 8)))
}
