/**
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
import java.lang.Math.pow

object Problem6 extends App {
  val range = 1 to 100
  val sumOfSquares = range.map(pow(_, 2)).sum.toInt
  val squareOfSums = pow(range.sum, 2).toInt

  println(squareOfSums - sumOfSquares)
}
