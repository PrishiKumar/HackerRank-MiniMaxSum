import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.List

object Solution {

    // Complete the staircase function below.
    def staircase(n: Int) {
    val a = 0
    for ( a  <- 1 to n) {
    val list = List.fill(n-a)(" ")
    val hash = List.fill(a)("#")
    val combine = List(list,hash).flatten.mkString
    println(combine)
    
   }

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        staircase(n)
    }
}
