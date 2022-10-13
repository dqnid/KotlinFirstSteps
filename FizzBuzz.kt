fun main(){
val num = 100

    for (i in 1..num){
        if (i%3==0 && i%5==0)
            println("FizzBuzz")
        else if (i%3==0)
            println("Fizz")
        else if (i%5==0)
            println("Buzz")
        else
            println(i)
    }

    val str = listOf("FizzBuzz","Fizz","Buzz")
    val red = "\u001b[32m"
    val reset = "\u001b[0m"
    println()
    for (i in num downTo 1 step 1){
        if (i%3==0 && i%5==0)
            print(red + str[0])
        else if (i%3==0)
            print(red + str[1])
        else if (i%5==0)
            print(red + str[2])
        else
            print(reset + i)
    }
    println()
}