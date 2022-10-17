fun main(args: Array<String>){
    val temp = args.map { it.toInt() }
    var unordered = temp.toCollection(ArrayList())
    var ordered = ArrayList<Int>()
   
    while (!unordered.isEmpty()){
        var min = unordered.get(0)
        for (j in unordered){
            if (j < min){
                min = j
            }
        }
        ordered.add(min)
        unordered.remove(min)
    }
   
    print("The ordered list is: ")
    for (i in ordered){
        print(" "+i)
    }

    var max = 0
    var pos = 0
    for (i in 0..(ordered.size-2)){
        if ((ordered.get(i+1)-ordered.get(i)) > max){
            max = ordered.get(i+1)-ordered.get(i)
            pos = i
        }
    }
    
    print("\nMax gap: " + max + " at position: " + (pos+1))
}