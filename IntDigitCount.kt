fun main(args: Array<String>){
    val num = args[0].toInt()
    println(countIntDigits(num))
}

fun countIntDigits(num: Int): Int{
    if (num/10 == 0){
        return 1
    }else{
        return 1+countIntDigits(num/10)
    }
}