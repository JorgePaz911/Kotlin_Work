package kotlin2


fun main() {
    var pair = Pair("Hello", "World")
    println("${pair.first} and ${pair.second}")

    var pair2 = "Hello" to "World"
    println("${pair2.first} and ${pair2.second}")

    val triple = Triple("Jorge", 31, "Mexico")
    println("${triple.first} and ${triple.second} and ${triple.third}")
}