package kotlin3

import java.util.*

//this can be done with arrayOf as well. The exact same way
fun main() {
    val mine = listOf("apple", "orange", "banana")
    val jake = listOf("watermelon", "mango")
    val jane = listOf("strawberries", "blueberries")

    val all = listOf(mine, jake, jane)

    println(all)
    println(all.flatten())
    val flattened = mine.plus(jake).plus(jane)
    println(flattened)
    val noJaneNoApple = flattened.minus(jane).minus("apple")
    println(noJaneNoApple)

    val abbreviations = flattened.map { it.substring(0,3).uppercase(Locale.getDefault()) }
                                .map { it.contains("R") }
                                .reversed()
    println(abbreviations)
}