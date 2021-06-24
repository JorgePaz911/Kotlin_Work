package kotlin3

fun main() {
    var approved = mutableListOf("ten", "eleven")
    val namesList = listOf("one", "two", "three", "four", "five")

    namesList.filterTo(approved) { it.contains("t") } //moves all items that contain a t, to approved
    namesList.filterNotTo(approved) { it.contains("t") } // moves all items that don't contain a t, to approved
    println(approved)
}