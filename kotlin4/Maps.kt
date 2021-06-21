package kotlin4



fun main(){

    val states2 = mutableListOf(
        "NY",
        "OR"
    )

    states2.add("CA")

    val states = mutableMapOf(
        "NY" to "New York",
        "CA" to "California",
        "OR" to "Oregon"
    )

    states.put("WA", "Washington")

    //Doesn't get added because NY already exists
    states.putIfAbsent("NY", "York York")

    //Only removes if key and value match
    states.remove("NY", "YORK")

    //returns item if it exists. If it doesn't, it adds the item
    val res6 = states.getOrPut("UT") { "Utah" }

    val res = states.getOrDefault("FL", "UNKNOWN")
    val res2 = states["OR"]
    val res3 = states.containsValue("California")
    val res4 = states.keys
    val res5 = states.values

    println(res)
    println(res2)
    println(res3)
    println(res4)
    println(res5)
    println(res6)
}