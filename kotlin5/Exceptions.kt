package kotlin5

import java.lang.IllegalArgumentException


class InvalidAgeException(val age: Int, val msg: String):
    IllegalArgumentException("Invalid age: $age. $msg"){

}

fun checkAge(age: Int){
    if(age < 18){
        throw InvalidAgeException(age, "User too young")
    }
}

fun main() {
    val age = 15
    try {
        checkAge(age)
    }catch (ex: InvalidAgeException){
        println("Caught. Don't want things to break")
    }finally{
        println("Finally block")
    }


    println("Yo")
}