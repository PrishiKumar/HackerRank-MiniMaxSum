import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the miniMaxSum function below.
    def miniMaxSum(arr: Array[Long]) {

     // Finding the sum of the array
      var sum : Long = arr.sum  
      
     // Finding the min value in array
      var min : Long =arr.min
      
     // Finding the max value in array 
      var max : Long = arr.max

    // Finding min sum
     var answer1 : Long = sum - max
     
    // Finding max sum 
     var answer2 : Long = sum - min

     println(answer1 +" " +answer2)
      
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val arr = stdin.readLine.split(" ").map(_.trim.toLong)
        miniMaxSum(arr)
    }
}
