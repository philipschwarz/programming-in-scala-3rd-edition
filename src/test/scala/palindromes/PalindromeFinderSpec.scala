package palindromes

import org.scalatest.FunSpec

class PalindromeFinderSpec extends FunSpec {

  val palindromeFinder = new PalindromeFinder

  describe("Empty Input") {
    it("should result in no palindrome"){
      assert(List() == palindromeFinder.findPalindrome(""))
    }
  }

  describe("Input that is simplest palindrome aa") {
    it("should result in aa:0:2"){
      assert(List(new Palindrome("aa", 0, 2)) == palindromeFinder.findPalindrome("aa"))
    }
  }

  describe("Input that is palindrome abcddcba") {
    it("should result in abcddcba:0:8"){
      assert(List(new Palindrome("abcddcba", 0, 8)) == palindromeFinder.findPalindrome("abcddcba"))
    }
  }

  describe("Input caaz with substring that is simplest palindrome aa") {
    it("should result in aa:0:8"){
      assert(List(new Palindrome("aa", 1, 2)) == palindromeFinder.findPalindrome("caaz"))
    }
  }

  describe("Input abcdeffedghi with substring that is palindrome deffed") {
    it("should result in deffed:3:6"){
      assert(List(new Palindrome("deffed", 3, 6)) == palindromeFinder.findPalindrome("abcdeffedghi"))
    }
  }

  describe("Input abcdeffedghideffedjkl containing two identical deffed palindromes") {
    it("should result in deffed:3:6 and deffed:12:6"){
      val palindromes = palindromeFinder.findPalindrome("abcdeffedghideffedjkl")
      assert(palindromes.length == 2)
      assert(palindromes.contains(new Palindrome("deffed", 3, 6)))
      assert(palindromes.contains(new Palindrome("deffed", 12, 6)))
    }
  }

  describe("Input abcdeffedghijkllkjimno containing palindromes deffed and ijkllkji") {
    it("should result in deffed:3:6 and ijkllkji:11:8"){
      val palindromes = palindromeFinder.findPalindrome("abcdeffedghijkllkjimno")
      assert(List(new Palindrome("ijkllkji", 11, 8),
                  new Palindrome("deffed", 3, 6))
             == palindromes)
    }
  }

  describe("Input abccbadeffed containing adjacent palindromes abccba and deffed") {
    it("should result in abccba:0:6 and deffed:6:6"){
      val palindromes = palindromeFinder.findPalindrome("abccbadeffed")
      assert(palindromes.length == 2)
      assert(palindromes.contains(new Palindrome("abccba", 0, 6)))
      assert(palindromes.contains(new Palindrome("deffed", 6, 6)))
    }
  }

  describe("Input abcdeffedghijkllkjimnopp containing three palindromes deffed, ijkllkji and pp") {
    it("should result in deffed:3:6 and ijkllkji:11:8 and pp:22:2"){
      val palindromes = palindromeFinder.findPalindrome("abcdeffedghijkllkjimnopp")
      assert(List(new Palindrome("ijkllkji", 11, 8),
                  new Palindrome("deffed", 3, 6),
                  new Palindrome("pp", 22, 2))
                  == palindromes)
    }
  }

  describe("Input abcdeffedghijkllkjimnoppqrssr containing four palindromes deffed, ijkllkji, pp and rssr") {
    it("should result in ijkllkji:11:8 and deffed:3:6 and rssr:25:4"){
      val palindromes = palindromeFinder.findPalindrome("abcdeffedghijkllkjimnoppqrssr")
      assert(List(new Palindrome("ijkllkji", 11, 8),
                  new Palindrome("deffed", 3, 6),
                  new Palindrome("rssr", 25, 4))
              == palindromes)
    }
  }

  describe("Input sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop containing numerous palindromes") {
    it("should result in hijkllkjih:23:10 and defggfed:13:8 and abccba:5:6"){
      val palindromes = palindromeFinder.findPalindrome("sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop")
      assert(List(new Palindrome("hijkllkjih", 23, 10),
                  new Palindrome("defggfed",   13,  8),
                  new Palindrome("abccba",      5,  6))
              == palindromes)
    }
  }
}