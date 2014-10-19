/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
object Problem4 extends App {
  def isPalindrome(x: String) = x.reverse == x

  val range = 999 to 100 by -1

  val palindromes = for {
    left <- range
    right <- range
    product = left * right
    if isPalindrome(product.toString)
  } yield product

  println(palindromes.max)
}
