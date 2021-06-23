package kotlin6


fun main() {
    // val lambdaName: (InputType) -> Return Type = { arguments:InputType -> body }

//    lineLogger {
//        println("msg1")
//        println("msg2")
//        println("msg3")
//    }

    repeater(15) { index ->
        if(index < 3) println("Hello")
        else println("GoodBye")
    }

}

fun repeater(times: Int, block: (Int) -> Unit){
    repeat(times) { index -> block(index)}
}

fun lineLogger(block: () -> Unit){
    repeat(2){ println("------") }
    block()
    repeat(2){ println("------") }
}