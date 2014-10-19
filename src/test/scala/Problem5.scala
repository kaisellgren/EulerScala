/**
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
object Problem5 extends App {
  def isMultipleOf(n: Int)(m: Int) = n % m == 0

  val range = 1 to 20

  def accumulator(x: Int = 1): Int = {
    if (range.forall(isMultipleOf(x))) x
    else accumulator(x + 1)
  }

  println(accumulator())
}
