package SearchAndSort

import scala.annotation.tailrec

object SelectionSort extends App {

  val nums = Array(5, 3, 6, 2, 10, 36).toList

  @scala.annotation.tailrec
  def findSmallest(list: Seq[Int], smallest: Int): Int = {
    if (list.tail.isEmpty) smallest
    else if (list.tail.head < smallest) findSmallest(list.tail, list.tail.head)
    else findSmallest(list.tail, smallest)
  }
  println(findSmallest(nums, nums(0)))
  @tailrec
  def selectionSort(list: Seq[Int], accumulator: Vector[Int] = Vector()) : Vector[Int] = {
    if (list.isEmpty) accumulator
    else {
      val smallest = findSmallest(list, list(0))
      val popSmallest = list.filter(x => x != smallest)
      selectionSort(popSmallest, accumulator :+ smallest)
    }
  }
  println(selectionSort(nums))
}
