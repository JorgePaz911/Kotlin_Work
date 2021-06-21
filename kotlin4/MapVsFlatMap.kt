package kotlin4

import java.util.*

class ShoppingBag(val item: List<String>)

fun main() {
    val bag1 = listOf(
        ShoppingBag(listOf("food1", "food2", "food3")),
        ShoppingBag(listOf("food4", "food5", "food6")),
        ShoppingBag(listOf("food7", "food8", "food9")),
    )

    val bag2 = listOf(
        ShoppingBag(listOf("food11", "food22", "food33")),
        ShoppingBag(listOf("food44", "food55", "food66")),
        ShoppingBag(listOf("food77", "food88", "food99"))
    )

    val groceries1 = bag1.flatMap { it.item }
    println(groceries1)

    val groceries2 = bag2.map { it.item }
    println(groceries2)

    val people = listOf(
       Person2("Mike"),
        Person2("Jane"),
        Person2("Bill")
    )

    people.map { it.name }
        .map { it.uppercase(Locale.getDefault()) }
        .map { println(it.reversed()) }

}

private data class Person2(val name: String)