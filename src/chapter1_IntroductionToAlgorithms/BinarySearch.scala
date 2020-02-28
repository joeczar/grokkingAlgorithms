package chapter1_IntroductionToAlgorithms

object BinarySearch extends App {

  def binarySearchInt(item: Int, l: Seq[Int]): Option[Int] = {
    @scala.annotation.tailrec
    def loop(x: Int, l: Seq[Int], low: Int = 0, high: Int = l.length - 1 ): Option[Int] = {
      val mid = (low + high) / 2
      val guess = l(mid)
      println(s"Int List ----- guess: $guess, low: $low, high: $high")
      if (low > high) return None
      if (guess == x) Some(mid)
      else if (guess > x){
        loop(x, l, low, mid -1) }
      else {
        loop(x, l, mid +1, high) }
    }
    loop(item, l, 0, l.length -1 )
  }

  val myVector = (50 to 100).toVector

  println(binarySearchInt(1, myVector))

  def binarySearchString(item: String, list: Seq[String]): Option[Int] = {
    val l: Seq[String] = list.sorted.toVector
    @scala.annotation.tailrec
    def loop(x: String, l: Seq[String], low: Int = 0, high: Int = l.length - 1 ): Option[Int] = {

      val mid = (low + high) / 2
      val guess = l(mid)
      println(s"StringList ----- guess: $guess, low: $low, high: $high")
      if (low > high) return None
      if (guess == x) Some(l.indexOf(guess))
      else if (guess > x) loop(x, l, low, l.indexOf(guess) -1)
      else loop(x, l, l.indexOf(guess) +1, high)
    }
    loop(item, l, 0, (l.length -1))
  }
  val listOfStrings = List("Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Eta", "Theta", "Iota", "Kappa")
  println(binarySearchString("Joe", listOfStrings))
}
