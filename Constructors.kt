



class Animal(var name: String, var weight: Int, var isFourLegged: Boolean){

    constructor(name: String, weight: Int): this(name, weight, true)

    constructor(name: String): this(name, 0)

    var fullDetails = "$name | $weight | $isFourLegged"
    val fullDetailsLength = fullDetails.length

    init {
        println("init block")
        println("Details: $fullDetails is $fullDetailsLength characters long.")
    }

    override fun toString(): String {
        return "$name, $weight lbs, has 4 legs: $isFourLegged"
    }

}

fun main() {
    var a1 = Animal(name = "Monkey", isFourLegged = false, weight = 5)
    var a2 = Animal("Horse", 150)
    var a3 = Animal("Cow")

    println(a1.toString())
    println(a2.toString())
    println(a3.toString())

    println(a1.fullDetails)
    println(a1.fullDetailsLength)
}