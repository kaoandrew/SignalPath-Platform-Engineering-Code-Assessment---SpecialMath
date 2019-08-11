object SpecialMath extends App {
  def specialMath (n:Int) : Int = {
    if (n == 0) {
      return 0
    }
    else if (n == 1) {
      return 1
    }
    var sum:Int = 0
    sum = n + specialMath(n - 1) + specialMath(n - 2)
    sum
  }
  var input = args(0)
  var input1 = input.toInt
  println("Final sum = " + specialMath(input1))
}
