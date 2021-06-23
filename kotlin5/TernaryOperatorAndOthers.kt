package kotlin5



fun main(){
    val a = true
    val b = true
    //val res = a==b ? 1 : 0 cannot do this in Kotlin
    val res = if(a == b) 1 else 0

    println(res)

    val name: String? = null
    println(name?.length)
    println(name?.length ?: null) //same as the one above
    println(name?.length ?: 0)
    println(if(name != null) name.length else 0) //same as the one above

    val t1: Thing? = Thing("t1")
    println(t1?.name ?: "EMPTY NAME")

    val t2: Thing? = null
    println(t2?.name  ?: "EMPTY NAME")

    val names = listOf("Jane", "", "Bill", "Mike", null, null , "Mary", null, "")

    println(names.filterNotNull().filter{ it.isNotEmpty() })

}

class Thing(var name: String)