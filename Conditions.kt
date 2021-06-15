

private fun init(){
    val num1 = 200
    val num2 = -1

    if(num1 < num2) println("num1 smaller")
    else if(num1 == num2) println("equal")
    else println("num1 larger")

    if((num1 == num2) && (num1 > 10)) println("WOW!")

    if((num2 == 100) || (num2 < 0)) println("out of range")

    var fName = "Bob"
    var sName = "Bob"

    println(fName == sName)

}


fun main() {
    init()
}