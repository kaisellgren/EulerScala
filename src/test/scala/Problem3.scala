/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
import java.lang.Math.sqrt

object Problem3 extends App {
  type Factors = Vector[Int]

  val n = 600851475143L
  
  def findFactors(i: Int, until: Int, n: Long, factors: Factors = Vector()): Factors = {
    if (i < until) {
      def accumulator(n: Long, factors: Factors = Vector()): (Long, Factors) = n % i match {
        case 0 => accumulator(n / i, factors :+ i)
        case _ => (n, factors)
      }

      val (n2, factors2) = accumulator(n)
      findFactors(i + 1, until, n2, factors ++ factors2)
    } else {
      factors
    }
  }

  println(findFactors(2, sqrt(n).toInt, n).max)
}
