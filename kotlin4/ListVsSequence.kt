package kotlin4


fun main() {
    listOf("A","B","C")
        .filter{
            println(it)
            true
        }
        .forEach { println(it) }

    println("---------")

    sequenceOf("A","B","C")
        .filter{
            println(it)
            true
        }
        .forEach { println(it) }

}