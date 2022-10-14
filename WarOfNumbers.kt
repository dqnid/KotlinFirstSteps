import kotlin.math.abs
fun main(args:Array<String>){
    var even = 0
    var odd = 0
    for (a in args){
        val temp = a.toInt()
        if (temp%2==0)
            even+=temp
        else
            odd+=temp
    }
    val res = abs(even - odd)
    if (even > odd){
        print("Even win by ")
    } else if (even < odd){
        print("\nOdd win by ")
    } else {
        print("\nDraw at ")
    }
    print("" + res + "\n")
}