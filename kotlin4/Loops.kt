package kotlin4


fun main(){
    val values = listOf(1,2,3,4,5,6)
    //values.forEach { println(it) }

//    for (number in values){
//        println(number)
//    }

    for (i in 0 .. 10 step 2){
        print("$i ")
    }
    println("")
    for(i in 10 downTo 0 step 3){
        print("$i ")
    }
    println("")
    var x = 0
    while (x < 10){
        print("$x  ")
        x++
    }

    println("")
    values.forEachIndexed{i, num ->
        println("Index: $i | Value: $num")
    }


    x = 11
    if(x in 1..10) println("Range 1-10")
    else println("Out of range")

}