package kotlin6


// val lambdaName: (InputType) -> Return Type = { arguments:InputType -> body }
fun main(){

//    derbyAnnouncer { num ->
//        "The number $num is amazing"
//    }

    randomNums (8){ num ->
        print("$num ")
    }

}

fun randomNums(times: Int, block: (Int) -> Unit){
    repeat(times) {
        val rand = nums.random()
        block(rand)
    }
}

val nums = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)

fun derbyAnnouncer(block: (Int) -> String){
    val nums = listOf(1,2,3,4,5,6,7,8)
    val randomNum = nums.random()
    println("The next random num is: $randomNum")
    val msg = block(randomNum)
    println(msg)
}