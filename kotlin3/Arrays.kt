package kotlin3

import Person

fun main() {
    val intItems = intArrayOf(1,2,3,4,5,6)
    intItems.forEach { println(it) }

    val stringItems = arrayOf("Jorge", "Ivan", "Paz", "Mercado")
    stringItems.forEach { println(it) }

    val personItems = arrayOf(
        Person("John"),
        Person("Jane")
    )
    personItems.forEach { println(it.name) }

    println(personItems[0].name)

}