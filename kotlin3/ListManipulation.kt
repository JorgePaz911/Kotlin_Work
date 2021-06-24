package kotlin3

import java.util.*

fun main() {
    val namesList = listOf("one", "two", "three", "four", "five")
    val filteredList = namesList.filter { it != "three"} // returns items that are not "three"
    val filteredList2 = namesList.filter { it.lowercase(Locale.getDefault()).contains("t") }
    val filteredList3 = namesList.filterNot { it.lowercase(Locale.getDefault()).contains("t") }
    println(filteredList3)

    val ages = listOf(12,42,13,2,21,18,29)
    //val adult = ages.filter { it >= 18 }
    val adult = ages.filter (::isAdult)
    //println(adult)

    val result = namesList.firstOrNull { it == "FOO" }
    //println(result?.length) // ? means if the item is null return null or return length

}

fun isAdult(age: Int): Boolean{
    return age >= 18
}