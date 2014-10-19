import scala.math.sqrt

class PrimeStream(currentPrime: Int = 2, previousPrimes: Vector[Int] = Vector(2)) extends Stream[Int] {
  private val next = findNextPrime(currentPrime + 1)

  override def head = currentPrime
  override def tail = new PrimeStream(next, previousPrimes :+ next)

  protected def tailDefined = next != -1
  override def isEmpty = !tailDefined

  private def findNextPrime(n: Int): Int = {
    if (n == Int.MaxValue) -1
    else if (isPrime(n, previousPrimes)) n
    else findNextPrime(n + 1)
  }

  private def isPrime(n: Int, primes: Vector[Int]): Boolean = {
    if (primes.isEmpty || primes.head > sqrt(n)) true
    else if (n % primes.head == 0) false
    else isPrime(n, primes.tail)
  }
}