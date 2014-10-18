/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
import Math.sqrt

object Problem3 extends App {
  var n = 600851475143L

  val factors = (2 until sqrt(n).toInt).flatMap((i: Int) => {
    def accumulator(factors: Vector[Int]): Vector[Int] = {
      if (n % i == 0) {
        n /= i
        accumulator(factors :+ i)
      } else {
        factors
      }
    }
    accumulator(Vector())
  })

  println(factors.max)
}
