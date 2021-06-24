package kotlin4

import java.util.*

fun main() {

    val map = mutableMapOf(
        "NY" to "New York",
        "CA" to "California",
        "OR" to "Oregon",
        "AZ" to "Arizona",
        "NV" to "Nevada",
        "WA" to "Washington",
    )

    map.put("NJ", "New Jersey")

    println("${map.none()} | ${map.any()}")

    val resN = map.filter{it.key.contains("N")}
    println(resN)

    val resN2 = map.filter{it.key.contains("N")}
        .map { it.value.substring(0,3) }
        .map { it.uppercase() }

    println(resN2)

}