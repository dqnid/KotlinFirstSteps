fun main(args:Array<String>){
    println(split(args[0]))
}

fun split(str:String):ArrayList<String>{
    val opener : Char = '('
    val closer : Char = ')'
    var cOp:Int = 0
    var cClo:Int = 0
    var result = ArrayList<String>()
    var fragment:String = String()
    
    for (i in str){
        if (i == opener){
            cOp++
        } else if (i == closer) {
            cClo++
        } else {
            return arrayListOf("Error detectado")
        }
        fragment = fragment + i
        if (cOp == cClo){
           result.add(fragment) 
           fragment = ""
        }
    }
    return result
}