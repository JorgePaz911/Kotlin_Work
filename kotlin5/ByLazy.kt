package kotlin5

import java.lang.Thread.sleep


fun main(){

    //does computing just once then uses computed results for all other print calls
    //gives better performance
    val name: String by lazy {
        println("COMPUTING")
        sleep(3000)
        "Jorge"
    }

    println(name)
    println(name)
    println(name)
    println(name)

}