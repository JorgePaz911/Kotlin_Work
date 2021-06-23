package kotlin5

fun main(){

    val num: Int = 0

    val res: Any = when(num){
        0 -> 99
        1 -> "Hello"
        2 -> 16.0
        else -> false
    }

    //safe cast with elvis function
    val casted = res as? String ?: "UNKNOWN"
    println(casted)

    if(res is Int) println("Yes!")
    else println("No!")
}