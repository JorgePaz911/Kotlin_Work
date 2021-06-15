


private fun init(){

    var name: String? = "Hello"
    var length = name?.length //can hold a null or number

    var length2 = if(name != null) name.length else null

    var name2: String? = "Hello"

    //var length3 = name2?.substring(0,2)?.length
    var length3 = name2?.substring(0,2)?.length

    println(length3)

    var name3 = "Hello World"
    var length4 = name3.length

    println(length4)
}

fun main() {
    init()
}