/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
object Problem1 extends App {
  def isMultipleOf(n: Int, m: Int) = n % m == 0
  def isMultipleOf3Or5(n: Int) = isMultipleOf(n, 3) || isMultipleOf(n, 5)

  print((0 until 1000).filter(isMultipleOf3Or5).sum)
}
