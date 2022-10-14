import kotlin.math.*
fun main(){
    val a:Double = 1.0
    val b:Double = 2.0
    val c:Double = 1.0

    val rightP = b.pow(2) - (4*a*c)
    
    if (rightP < 0){
        println("0 solutions (has complex roots)")
    } else if (sqrt(rightP) == 0.0){
        println("1 solution")
    } else {
        println("2 solutions")
    }
}