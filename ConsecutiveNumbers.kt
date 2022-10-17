import consecutiveCheck

fun main(args: Array<String>){
    val temp = args.map { it.toInt() }
    var unordered = temp.toCollection(ArrayList())
    
    val result = consecutiveCheck(unordered)
    when (result){
        true -> println("True")
        false -> println("False")
    }
}

fun consecutiveCheck(unordered: ArrayList<Int>): Boolean{
    var ordered = ArrayList<Int>()
    while (!unordered.isEmpty()){
        var min = unordered.get(0)
        for (i in unordered){
            if (i<min){
                min = i
            }
        }
        ordered.add(min)
        unordered.remove(min)
    }

    for (i in 0..(ordered.size-2)){
        if ((ordered.get(i+1)-ordered.get(i))!=1){
            return false
        }
    }
    return true 
}