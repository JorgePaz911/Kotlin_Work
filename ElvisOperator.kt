

private fun init(){
    var name: String? = null

    var length: Int = name?.substring(0,2)?.length ?: 10

    println(length) // returns 10
}
fun main() {
    init()
}