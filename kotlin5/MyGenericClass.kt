package kotlin5


fun main() {
    val listInt = EvenList(listOf(1,2,3,4,5,6,7,8,9))
    println(listInt.evens())

    val listString = EvenList(listOf("one", "two", "three", "four", "five"))
    println(listString.evens())

}


class EvenList<TYPE>(val list: List<TYPE>){
    fun evens(): List<TYPE>{
        return list.filterIndexed{ i, value -> i % 2 == 0}
    }
}