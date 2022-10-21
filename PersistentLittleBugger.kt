fun main(args:Array<String>){
    println(plb(args[0].toInt()))
}

fun plb(num:Int):Int{
    if (num/10 == 0){
        return 0
    }

    var str = num.toString()
    var persist:Int = 1
    for (i in str){
        persist *= i.digitToInt()
    }

    if (persist.toInt()/10 == 0){
        return 1
    }else{
        return 1+plb(persist.toInt())
    }
}