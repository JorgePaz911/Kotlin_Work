package kotlin3


fun main() {
    val items = listOf(1,2,3,4,5)
    items.first()
    items.last()
    items.size
    //items.forEach { println(it) }

    val items2 = mutableListOf(11,22,33,44,55,33)
    //items2.forEach { println(it) }
    items2.add(6)
    //items2.forEach { println(it) }
    items2.remove(33) //removes the number 3 not index 3
    items2.removeAt(0) //removes index 0
    items2.forEach { println(it) }

}