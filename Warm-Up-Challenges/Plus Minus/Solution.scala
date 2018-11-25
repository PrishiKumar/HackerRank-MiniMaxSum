import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.math.BigDecimal
object Solution {

    // Complete the plusMinus function below.
    def plusMinus(arr: Array[Int]) {
      val a : BigDecimal = arr.size
    var positive : BigDecimal = 0.000000
    var zero : BigDecimal= 0.000000
    var negative : BigDecimal = 0.000000
    for ( b <- arr){
    if (b > 0 ){
    positive += 1
}
  if(b == 0){
   zero += 1
}
    if(b < 0 ){
   negative += 1
  }
  }
   val f : BigDecimal =(positive/a)
   printf("%.6f", f)
   println()
   val g : BigDecimal = (negative/a)
    printf("%.6f",g)
    println()
    val h : BigDecimal = (zero/a)
     printf("%.6f",h)

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        plusMinus(arr)
    }
}
