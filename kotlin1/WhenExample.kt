package kotlin1


fun main() {

    var num: Int = 12
    var num2: Int = 10

    when(num % 2){
        0 -> println("The number is even")
        1 -> {
            println("The number is odd")
            println("Second line")
        }
        else -> println("Never reaching here!")
    }

    when{
        num == 13 && num2 == 13 -> println("Both 13")
        num % 2 == 0 -> println("even")
        num % 2 == 1 || num2 == 10 -> println("Weird Case")
        num % 2 == 1 || num2 == 10 -> println("Weird Case2")
    }

}